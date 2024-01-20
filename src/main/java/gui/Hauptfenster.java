package gui;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.List;

import models.Ticket;
import controllers.TicketController;

public class Hauptfenster extends JFrame {
    private JPanel mainPanel;
    private TicketListPanel ticketListPanel;
    private TicketDetailPanel ticketDetailPanel;
    private TicketController ticketController;

    public Hauptfenster() {
        setTitle("Ticket System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        ticketController = new TicketController();
        setupUIComponents();

        setVisible(true);
    }

    private void setupUIComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Datei");
        JMenuItem exitItem = new JMenuItem("Beenden");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        JMenu ticketMenu = new JMenu("Ticket");
        JMenuItem createTicketItem = new JMenuItem("Ticket erstellen");
        createTicketItem.addActionListener(e -> openTicketCreationDialog());
        ticketMenu.add(createTicketItem);

        menuBar.add(fileMenu);
        menuBar.add(ticketMenu);
        setJMenuBar(menuBar);

        // Panels
        ticketListPanel = new TicketListPanel();
        ticketDetailPanel = new TicketDetailPanel();

        mainPanel.add(new JScrollPane(ticketListPanel), BorderLayout.CENTER);
        mainPanel.add(ticketDetailPanel, BorderLayout.EAST);

        JButton aktualisierenButton = new JButton("Aktualisieren");
        aktualisierenButton.addActionListener(e -> {
            List<Ticket> tickets = ticketController.fetchAllTickets();
            ticketListPanel.updateTicketData(tickets);
        });
        mainPanel.add(aktualisierenButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void openTicketCreationDialog() {
        TicketErstellungsDialog dialog = new TicketErstellungsDialog(this);
        dialog.setVisible(true);
    }
}