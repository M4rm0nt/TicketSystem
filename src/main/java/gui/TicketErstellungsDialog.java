package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import enums.Prioritaet;
import models.Ticket;
import controllers.TicketController;

import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import static enums.Zustand.OFFEN;

public class TicketErstellungsDialog extends JDialog {
    private JTextField problembeschreibungField;
    private JComboBox<Prioritaet> prioritaetJComboBox;
    private JButton speichernButton;
    private TicketController ticketController = new TicketController();

    public TicketErstellungsDialog(JFrame parent) {
        super(parent, "Ticket erstellen", true);

        // Layout und Komponenten initialisieren
        setLayout(new BorderLayout());

        // Problembeschreibung
        problembeschreibungField = new JTextField(20);
        JPanel problembeschreibungPanel = new JPanel();
        problembeschreibungPanel.add(new JLabel("Problembeschreibung:"));
        problembeschreibungPanel.add(problembeschreibungField);
        add(problembeschreibungPanel, BorderLayout.NORTH);

        // Priorität Auswahl
        prioritaetJComboBox = new JComboBox<>(Prioritaet.values());
        JPanel prioritaetPanel = new JPanel();
        prioritaetPanel.add(new JLabel("Priorität:"));
        prioritaetPanel.add(prioritaetJComboBox);
        add(prioritaetPanel, BorderLayout.CENTER);

        // Speichern Button
        speichernButton = new JButton("Speichern");
        speichernButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ticket ticket = new Ticket();
                ticket.setProblembeschreibung(problembeschreibungField.getText());
                ticket.setPrioritaet((Prioritaet) prioritaetJComboBox.getSelectedItem());
                ticket.setErfassungsdatum(LocalDateTime.now()); // Erfassungsdatum auf aktuelle Zeit setzen
                ticket.setZustand(OFFEN);
                ticket.setBenutzerId(1);

                ticketController.addTicket(ticket);
                dispose(); // Dialog schließen
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(speichernButton);
        add(buttonPanel, BorderLayout.SOUTH);

        pack(); // Größe des Dialogs an die Inhalte anpassen
        setLocationRelativeTo(parent); // Zentriert den Dialog relativ zum Elternfenster
    }
}
