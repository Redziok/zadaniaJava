package pl.imiajd.Mingielewicz.Zad10;

import pl.imiajd.Mingielewicz.Zad10.Osoba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student extends Osoba {
    public Student(String nazwisko,LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + getNazwisko() + ", " + getDataUrodzenia().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ",srednia: " + getSredniaOcen() + "]";
    }

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Student)) {
            throw new IllegalArgumentException("wrong object");
        }
        Student s = (Student)obj;
        int result = getNazwisko().compareTo(s.getNazwisko());
        if(result != 0)
            return result;
        result = getDataUrodzenia().compareTo(s.getDataUrodzenia());
        if(result != 0)
            return result;
        result = ((Double) getSredniaOcen()).compareTo((getSredniaOcen()));
        return result;
    }

    public double getSredniaOcen() { return sredniaOcen; }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private double sredniaOcen;
}