package pl.imiajd.Mingielewicz.Poprawa;

import pl.imiajd.Mingielewicz.Poprawa.Student;
import pl.imiajd.Mingielewicz.Poprawa.Stypendium;

import java.time.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Stypendium lista = new Stypendium();

        lista.addStudent(new Student("Adam Mickiewicz", LocalDate.parse("1998-11-21"), 2));
        lista.addStudent(new Student("Juliusz Słowacki", LocalDate.parse("1998-11-21"), 3));
        lista.addStudent(new Student("Jan Brzechwa", LocalDate.parse("1997-10-20"), 3.5));
        lista.addStudent(new Student("Bolesław Prus", LocalDate.parse("1999-12-22"), 3.5));
        lista.addStudent(new Student("Jan Kochanowski", LocalDate.parse("2005-11-21"), 4));
        lista.addStudent(new Student("Jan Kochanowski", LocalDate.parse("2006-01-21"), 5));

        for (Student s : lista.getLista()) {
            System.out.println(s);
        }
        lista.getLista().sort(Student::compareTo);
        System.out.println("Posortowane: ");
        for (Student s : lista.getLista()) {
            System.out.println(s);
        }
    }

    public static Stypendium KwotaStypendium(Student s) {
        Stypendium uzyskaliStypendium = new Stypendium();
        if(s.getOcena()==5. &&  !s.getDataUrodzin().isBefore(LocalDate.parse("2005")))
            uzyskaliStypendium.addStudent(s);
        return uzyskaliStypendium;
    }
}
