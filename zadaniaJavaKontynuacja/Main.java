package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Osoba;
import pl.imiajd.Mingielewicz.Pracownik;
import pl.imiajd.Mingielewicz.Student;

import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        pl.imiajd.Mingielewicz.Osoba[] ludzie = new pl.imiajd.Mingielewicz.Osoba[2];

        ludzie[0] = new pl.imiajd.Mingielewicz.Pracownik(new String[]{"Jan","Tomasz"}, "Kowalski", false, LocalDate.parse("1995-05-25"), 50000, LocalDate.now());
        ludzie[1] = new pl.imiajd.Mingielewicz.Student(new String[]{"Małgorzata","Anna"}, "Nowak", true, LocalDate.parse("1998-06-26"), "informatyka", 5.00);

        for (pl.imiajd.Mingielewicz.Osoba p : ludzie) {
            for (String imie : p.getImiona()) {
                System.out.print(imie + " ");
            }
            System.out.print(p.getNazwisko() + ": Urodzony " + p.getDataUrodzenia() + ", " + p.getOpis());
            if (p.getPlec()) {
                System.out.print(", kobieta");
            } else {
                System.out.print(", mężczyzna");
            }
            System.out.println();
        }
    }
}
