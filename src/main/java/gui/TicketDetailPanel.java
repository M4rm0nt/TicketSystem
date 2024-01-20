package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TicketDetailPanel extends JPanel {
    private JLabel detailLabel;

    public TicketDetailPanel() {
        detailLabel = new JLabel("Ticket Details");
        add(detailLabel);
        // Weitere Detail-Elemente hinzufügen
    }

    // Methoden zum Setzen der Ticketdetails usw.
}
