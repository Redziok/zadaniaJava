package pl.imiajd.Mingielewicz.Zad10;

import pl.imiajd.Mingielewicz.Zad10.Osoba;
import java.util.*;
import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();

        grupa.add(new Osoba("Kowalski",LocalDate.parse("1995-05-25")));
        grupa.add(new Osoba("Sobieski", LocalDate.parse("1998-06-26")));
        grupa.add(new Osoba("Mickiewicz", LocalDate.parse("1998-06-26")));
        grupa.add(new Osoba("Mingielewicz", LocalDate.parse("1998-11-21")));
        grupa.add(new Osoba("Kowalski", LocalDate.parse("1994-04-24")));

        for (Osoba counter:  grupa) {
            System.out.println(counter);
        }
        System.out.println(grupa.get(4).equals(grupa.get(0)));
        System.out.println(grupa.get(2).compareTo(grupa.get(1)));
        Collections.sort(grupa);

        for (Osoba counter: grupa) {
            System.out.println(counter);
        }
    }
}