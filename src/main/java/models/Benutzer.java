package models;

import java.util.Objects;

public class Benutzer {
    private long benutzerId;
    private String name;
    private String email;
    private String rolle; // Zum Beispiel: Administrator, Mitarbeiter, Kunde
    private String passwort; // Beachten Sie Sicherheitsaspekte wie Verschlüsselung

    public Benutzer(long benutzerId, String name, String email, String rolle, String passwort) {
        this.benutzerId = benutzerId;
        this.name = name;
        this.email = email;
        this.rolle = rolle;
        this.passwort = passwort;
    }

    public long getBenutzerId() {
        return benutzerId;
    }

    public void setBenutzerId(long benutzerId) {
        this.benutzerId = benutzerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benutzer benutzer = (Benutzer) o;
        return benutzerId == benutzer.benutzerId && Objects.equals(name, benutzer.name) && Objects.equals(email, benutzer.email) && Objects.equals(rolle, benutzer.rolle) && Objects.equals(passwort, benutzer.passwort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benutzerId, name, email, rolle, passwort);
    }

    @Override
    public String toString() {
        return "Benutzer{" +
                "benutzerId=" + benutzerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rolle='" + rolle + '\'' +
                ", passwort='" + passwort + '\'' +
                '}';
    }
}
