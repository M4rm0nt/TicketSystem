package repositorys;

import enums.Prioritaet;
import enums.Zustand;
import models.Ticket;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    public void addTicket(Ticket ticket) {
        String sql = "INSERT INTO Ticket (Problembeschreibung, Priorität, Zustand, Erfassungsdatum, BenutzerID, KategorieID) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ticket.getProblembeschreibung());
            pstmt.setString(2, ticket.getPrioritaet().toString());
            pstmt.setString(3, ticket.getZustand().toString());
            pstmt.setTimestamp(4, Timestamp.valueOf(ticket.getErfassungsdatum()));
            pstmt.setLong(5, ticket.getBenutzerId());
            pstmt.setLong(6, ticket.getKategorieId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String query = "SELECT * FROM Ticket";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicketId(rs.getLong("TicketID"));
                ticket.setProblembeschreibung(rs.getString("Problembeschreibung"));
                ticket.setPrioritaet(Prioritaet.valueOf(rs.getString("Priorität")));
                ticket.setZustand(Zustand.valueOf(rs.getString("Zustand")));
                ticket.setErfassungsdatum(rs.getTimestamp("Erfassungsdatum").toLocalDateTime());
                Timestamp bearbeitungsdatum = rs.getTimestamp("Bearbeitungsdatum");
                if (bearbeitungsdatum != null) {
                    ticket.setBearbeitungsdatum(bearbeitungsdatum.toLocalDateTime());
                }
                ticket.setBenutzerId(rs.getLong("BenutzerID"));
                ticket.setKategorieId(rs.getLong("KategorieID"));

                tickets.add(ticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tickets;
    }

}
