package pl.imiajd.Mingielewicz.Poprawa;

import pl.imiajd.Mingielewicz.Poprawa.Student;

import java.util.*;

public class Stypendium {
    private static double kwotaStypendium;
    private ArrayList<Student> lista;

    public Stypendium() {
        lista = new ArrayList<>();
        setKwotaStypendium();
    }

    public void setKwotaStypendium() {
        kwotaStypendium = 500;
    }

    public void addStudent(Student student) {
        lista.add(student);
    }

    public ArrayList<Student> getLista() {
        return lista;
    }
}
