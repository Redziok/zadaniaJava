package pl.imiajd.Mingielewicz.Lab12;

import java.util.Arrays;
import java.util.LinkedList;

public class Zadanie12_03 {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>(Arrays.asList("Mickiewicz", "Kowalski", "Słowacki", "Sobieski", "Nowak", "Bednarczyk", "Somebody", "Rowling"));
        odwroc2(pracownicy);
    }

    public static void odwroc(LinkedList<String> Lista) {
        LinkedList<String> pomoc = new LinkedList<>();
        for(int i = Lista.size()-1; i >= 0; i--) {
            pomoc.add(Lista.get(i));
        }
        System.out.print(pomoc);
    }
    public static <T> void odwroc2(LinkedList<T> Lista) {
        LinkedList<T> pomoc = new LinkedList<>();
        for(int i = Lista.size()-1; i >= 0; i--) {
            pomoc.add(Lista.get(i));
        }
        System.out.print(pomoc);
    }
}

