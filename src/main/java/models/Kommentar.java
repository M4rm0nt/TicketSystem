package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Kommentar {
    private long kommentarId;
    private long ticketId;
    private long benutzerId;
    private String text;
    private LocalDateTime erstellungsdatum;

    public Kommentar(long kommentarId, long ticketId, long benutzerId, String text, LocalDateTime erstellungsdatum) {
        this.kommentarId = kommentarId;
        this.ticketId = ticketId;
        this.benutzerId = benutzerId;
        this.text = text;
        this.erstellungsdatum = erstellungsdatum;
    }

    public long getKommentarId() {
        return kommentarId;
    }

    public void setKommentarId(long kommentarId) {
        this.kommentarId = kommentarId;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public long getBenutzerId() {
        return benutzerId;
    }

    public void setBenutzerId(long benutzerId) {
        this.benutzerId = benutzerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(LocalDateTime erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kommentar kommentar = (Kommentar) o;
        return kommentarId == kommentar.kommentarId && ticketId == kommentar.ticketId && benutzerId == kommentar.benutzerId && Objects.equals(text, kommentar.text) && Objects.equals(erstellungsdatum, kommentar.erstellungsdatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kommentarId, ticketId, benutzerId, text, erstellungsdatum);
    }

    @Override
    public String toString() {
        return "Kommentar{" +
                "kommentarId=" + kommentarId +
                ", ticketId=" + ticketId +
                ", benutzerId=" + benutzerId +
                ", text='" + text + '\'' +
                ", erstellungsdatum=" + erstellungsdatum +
                '}';
    }
}
