package gui;

import models.Ticket;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TicketListPanel extends JPanel {
    private JTable ticketTable;
    private DefaultTableModel tableModel;

    public TicketListPanel() {
        tableModel = new DefaultTableModel(new Object[]{"ID", "Beschreibung", "Priorität", "Zustand", "Erfassungsdatum"}, 0);
        ticketTable = new JTable(tableModel);
        setLayout(new BorderLayout());
        add(new JScrollPane(ticketTable), BorderLayout.CENTER);
    }

    public void updateTicketData(List<Ticket> tickets) {
        tableModel.setRowCount(0);
        for (Ticket ticket : tickets) {
            tableModel.addRow(new Object[]{ticket.getTicketId(), ticket.getProblembeschreibung(), ticket.getPrioritaet(), ticket.getZustand(), ticket.getErfassungsdatum()});
        }
    }
}
