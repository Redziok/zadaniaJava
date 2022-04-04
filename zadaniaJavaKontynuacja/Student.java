package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Osoba;

import java.time.LocalDate;

class Student extends pl.imiajd.Mingielewicz.Osoba {
    public Student(String[] imiona, String nazwisko, Boolean plec, LocalDate dataUrodzenia, String kierunek, double sredniaOcen) {
        super(imiona,nazwisko,plec,dataUrodzenia);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek + ", średnia ocen: " + sredniaOcen;
    }

    public double getSredniaOcen() { return sredniaOcen; }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;

    private double sredniaOcen;
}