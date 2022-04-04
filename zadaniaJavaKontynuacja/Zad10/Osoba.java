package pl.imiajd.Mingielewicz.Zad10;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable {
    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + nazwisko + ", " + dataUrodzenia.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Osoba osoba = (Osoba)obj;
        return (osoba.getNazwisko().equals(this.getNazwisko()) && osoba.getDataUrodzenia().equals(this.getDataUrodzenia()));
    }

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Osoba)) {
            throw new IllegalArgumentException("wrong object");
        }
        Osoba o = (Osoba)obj;
        int result = getNazwisko().compareTo(o.getNazwisko());
        if(result != 0)
            return result;
        result = getDataUrodzenia().compareTo(o.getDataUrodzenia());
        return result;
    }

    public String getNazwisko() { return nazwisko; }

    public LocalDate getDataUrodzenia() { return dataUrodzenia; }

    private String nazwisko;

    private LocalDate dataUrodzenia;
}