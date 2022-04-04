package pl.imiajd.Mingielewicz.Lab12;

import java.util.*;

public class Zadanie12_01 {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>(Arrays.asList("Mickiewicz", "Kowalski", "Słowacki", "Sobieski", "Nowak", "Bednarczyk", "Somebody", "Rowling"));
        redukuj(pracownicy, 2);
        LinkedList<Integer> pracownicy2 = new LinkedList<>(Arrays.asList(5,6,7,8,9,1,2,3));
        redukuj2(pracownicy2, 2);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n) {
        var coKtory = n;
        int obecny = 0;
        List<String> doUsuniecia = new ArrayList<>();
        for(String s : pracownicy) {
            if((obecny+1)%coKtory==0) {
                System.out.println("usuwamy pozycje " + obecny + " " + s);
                doUsuniecia.add(pracownicy.get(obecny));
            }
            obecny++;
        }
        pracownicy.removeAll(doUsuniecia);

        System.out.println("Lista po redukcji: " );
        for(String s : pracownicy) {
            System.out.println(s);
        }
    }

    public static <T> void redukuj2(LinkedList<T> pracownicy, int n) {
        var coKtory = n;
        int obecny = 0;
        List<T> doUsuniecia = new ArrayList<>();
        for (Object s : pracownicy) {
            if ((obecny + 1) % coKtory == 0) {
                System.out.println("usuwamy pozycje " + obecny + " " + s);
                doUsuniecia.add(pracownicy.get(obecny));
            }
            obecny++;
        }

        pracownicy.removeAll(doUsuniecia);

        System.out.println("Lista po redukcji: ");
        for (T s : pracownicy) {
            System.out.println(s);
        }
    }

}