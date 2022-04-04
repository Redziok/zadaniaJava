package pl.imiajd.Mingielewicz;

import java.util.*;
import java.time.LocalDate;

abstract class Osoba {
    public Osoba(String[] imiona, String nazwisko, boolean plec, LocalDate dataUrodzenia) {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
    }
    public abstract String getOpis();

    public String[] getImiona() { return imiona; }

    public String getNazwisko() { return nazwisko; }

    public boolean getPlec() { return plec; }

    public LocalDate getDataUrodzenia() { return dataUrodzenia; }

    private String[] imiona = new String[2];

    private String nazwisko;

    private boolean plec;

    private LocalDate dataUrodzenia;
}
