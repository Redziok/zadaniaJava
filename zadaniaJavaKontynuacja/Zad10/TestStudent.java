package pl.imiajd.Mingielewicz.Zad10;

import pl.imiajd.Mingielewicz.Zad10.Osoba;
import pl.imiajd.Mingielewicz.Zad10.Student;
import java.util.*;
import java.time.LocalDate;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<Student>();

        grupa.add(new Student("Kowalski",LocalDate.parse("1995-05-25"),5.00));
        grupa.add(new Student("Sobieski", LocalDate.parse("1998-06-26"),4.50));
        grupa.add(new Student("Mickiewicz", LocalDate.parse("1998-06-26"),4.00));
        grupa.add(new Student("Mingielewicz", LocalDate.parse("1998-11-21"),5.50));
        grupa.add(new Student("Kowalski", LocalDate.parse("1994-04-24"),3.00));

        for (Student counter:  grupa) {
            System.out.println(counter);
        }
        System.out.println(grupa.get(4).equals(grupa.get(0)));
        System.out.println(grupa.get(2).compareTo(grupa.get(1)));
        Collections.sort(grupa);

        for (Student counter: grupa) {
            System.out.println(counter);
        }
    }
}