package pl.imiajd.Mingielewicz.Poprawa;

import java.time.*;
import java.util.*;

public class Student implements Cloneable, Comparable<Student> {
    private String nazwa;
    private LocalDate dataUrodzin;
    private double ocena;
    private List<Double> dozwoloneOceny = Arrays.asList(2., 3., 3.5, 4., 4.5, 5.);

    public Student(String nazwa, LocalDate dataUrodzin, double ocena) {
        this.nazwa = nazwa;
        this.dataUrodzin = dataUrodzin;
        if(!dozwoloneOceny.contains(ocena))
            throw new IllegalArgumentException("Nie można dodać takiej oceny!");
        this.ocena = ocena;
    }

    public String getNazwa() { return nazwa; }
    public LocalDate getDataUrodzin() { return dataUrodzin; }
    public double getOcena() { return ocena; }

    @Override
    public String toString() {
        return getNazwa() + ", Urodzony: " + getDataUrodzin() + ", Ocena: " + getOcena();
    }

    @Override
    public int compareTo(Student o) {
        int result = getDataUrodzin().compareTo(o.getDataUrodzin());
        if(result!=0) {
            return result;
        }
        result = getNazwa().compareTo(o.getNazwa());
        if(result!=0) {
            return result;
        }
        result = ((Double)getOcena()).compareTo(o.getOcena());
        return result;
    }
}
