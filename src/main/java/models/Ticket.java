package models;

import enums.Prioritaet;
import enums.Zustand;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    private long ticketId;
    private String problembeschreibung;
    private Prioritaet prioritaet;
    private Zustand zustand;
    private LocalDateTime erfassungsdatum;
    private LocalDateTime bearbeitungsdatum;
    private long benutzerId;
    private long kategorieId;

    public Ticket(long ticketId, String problembeschreibung, Prioritaet prioritaet, Zustand zustand, LocalDateTime erfassungsdatum, LocalDateTime bearbeitungsdatum, long benutzerId, long kategorieId) {
        this.ticketId = ticketId;
        this.problembeschreibung = problembeschreibung;
        this.prioritaet = prioritaet;
        this.zustand = zustand;
        this.erfassungsdatum = erfassungsdatum;
        this.bearbeitungsdatum = bearbeitungsdatum;
        this.benutzerId = benutzerId;
        this.kategorieId = kategorieId;
    }

    public Ticket() {
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public String getProblembeschreibung() {
        return problembeschreibung;
    }

    public void setProblembeschreibung(String problembeschreibung) {
        this.problembeschreibung = problembeschreibung;
    }

    public Prioritaet getPrioritaet() {
        return prioritaet;
    }

    public void setPrioritaet(Prioritaet prioritaet) {
        this.prioritaet = prioritaet;
    }

    public Zustand getZustand() {
        return zustand;
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }

    public LocalDateTime getErfassungsdatum() {
        return erfassungsdatum;
    }

    public void setErfassungsdatum(LocalDateTime erfassungsdatum) {
        this.erfassungsdatum = erfassungsdatum;
    }

    public LocalDateTime getBearbeitungsdatum() {
        return bearbeitungsdatum;
    }

    public void setBearbeitungsdatum(LocalDateTime bearbeitungsdatum) {
        this.bearbeitungsdatum = bearbeitungsdatum;
    }

    public long getBenutzerId() {
        return benutzerId;
    }

    public void setBenutzerId(long benutzerId) {
        this.benutzerId = benutzerId;
    }

    public long getKategorieId() {
        return kategorieId;
    }

    public void setKategorieId(long kategorieId) {
        this.kategorieId = kategorieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ticketId == ticket.ticketId && benutzerId == ticket.benutzerId && kategorieId == ticket.kategorieId && Objects.equals(problembeschreibung, ticket.problembeschreibung) && prioritaet == ticket.prioritaet && zustand == ticket.zustand && Objects.equals(erfassungsdatum, ticket.erfassungsdatum) && Objects.equals(bearbeitungsdatum, ticket.bearbeitungsdatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, problembeschreibung, prioritaet, zustand, erfassungsdatum, bearbeitungsdatum, benutzerId, kategorieId);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", problembeschreibung='" + problembeschreibung + '\'' +
                ", prioritaet=" + prioritaet +
                ", zustand=" + zustand +
                ", erfassungsdatum=" + erfassungsdatum +
                ", bearbeitungsdatum=" + bearbeitungsdatum +
                ", benutzerId=" + benutzerId +
                ", kategorieId=" + kategorieId +
                '}';
    }
}
