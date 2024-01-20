package models;

import java.util.Objects;

public class Kategorie {
    private long kategorieId;
    private String name;
    private String beschreibung;

    public Kategorie(long kategorieId, String name, String beschreibung) {
        this.kategorieId = kategorieId;
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public long getKategorieId() {
        return kategorieId;
    }

    public void setKategorieId(long kategorieId) {
        this.kategorieId = kategorieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategorie kategorie = (Kategorie) o;
        return kategorieId == kategorie.kategorieId && Objects.equals(name, kategorie.name) && Objects.equals(beschreibung, kategorie.beschreibung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kategorieId, name, beschreibung);
    }

    @Override
    public String toString() {
        return "Kategorie{" +
                "kategorieId=" + kategorieId +
                ", name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
