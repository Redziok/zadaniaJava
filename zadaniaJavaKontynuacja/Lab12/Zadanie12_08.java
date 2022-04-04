package pl.imiajd.Mingielewicz.Lab12;

import java.util.*;

public class Zadanie12_08 {
    public static void main(String[] args) {
        var testOsobaA = new TestClassA("Kowalski");
        var testOsobaB = new TestClassB(3);
        var listaOsobA = Arrays.asList(new TestClassA("Kowalski1"), new TestClassA("Kowalski2"), new TestClassA("Kowalski3"));
        printDwa(listaOsobA);
    }

    public static <E extends Iterable> void print(E e) {
        System.out.println(e.toString());
    }

    public static <E extends Iterable> void printDwa(List<E> e) {
        System.out.println(e.toString());
    }

    public static class TestClassA<E> implements Iterable<E> {
        private String test;

        public TestClassA(String test) {
            this.test = test;
        }

        @Override
        public String toString() {
            return test;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }
    }

    public static class TestClassB{
        private double liczba;

        public TestClassB(double liczba) {
            this.liczba = liczba;
        }

        @Override
        public String toString() {
            return String.valueOf(liczba);
        }
    }
}
