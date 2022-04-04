package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Osoba;

import java.time.LocalDate;

class Pracownik extends pl.imiajd.Mingielewicz.Osoba {
    public Pracownik(String[] imiona, String nazwisko, Boolean plec, LocalDate dataUrodzenia, double pobory, LocalDate dataZatrudnienia) {
        super(imiona,nazwisko,plec,dataUrodzenia);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() { return dataZatrudnienia; }

    public String getOpis() {
        return String.format("pracownik z pensją: %.2f zł, Zatrudniony: %s", pobory , dataZatrudnienia);
    }

    private double pobory;

    private LocalDate dataZatrudnienia;
}
