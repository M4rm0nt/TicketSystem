package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Historie {
    private long historieId;
    private long ticketId;
    private long benutzerId;
    private String aenderungsbeschreibung;
    private LocalDateTime aenderungsdatum;

    public Historie(long historieId, long ticketId, long benutzerId, String aenderungsbeschreibung, LocalDateTime aenderungsdatum) {
        this.historieId = historieId;
        this.ticketId = ticketId;
        this.benutzerId = benutzerId;
        this.aenderungsbeschreibung = aenderungsbeschreibung;
        this.aenderungsdatum = aenderungsdatum;
    }

    public long getHistorieId() {
        return historieId;
    }

    public void setHistorieId(long historieId) {
        this.historieId = historieId;
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

    public String getAenderungsbeschreibung() {
        return aenderungsbeschreibung;
    }

    public void setAenderungsbeschreibung(String aenderungsbeschreibung) {
        this.aenderungsbeschreibung = aenderungsbeschreibung;
    }

    public LocalDateTime getAenderungsdatum() {
        return aenderungsdatum;
    }

    public void setAenderungsdatum(LocalDateTime aenderungsdatum) {
        this.aenderungsdatum = aenderungsdatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historie historie = (Historie) o;
        return historieId == historie.historieId && ticketId == historie.ticketId && benutzerId == historie.benutzerId && Objects.equals(aenderungsbeschreibung, historie.aenderungsbeschreibung) && Objects.equals(aenderungsdatum, historie.aenderungsdatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historieId, ticketId, benutzerId, aenderungsbeschreibung, aenderungsdatum);
    }

    @Override
    public String toString() {
        return "Historie{" +
                "historieId=" + historieId +
                ", ticketId=" + ticketId +
                ", benutzerId=" + benutzerId +
                ", aenderungsbeschreibung='" + aenderungsbeschreibung + '\'' +
                ", aenderungsdatum=" + aenderungsdatum +
                '}';
    }
}
