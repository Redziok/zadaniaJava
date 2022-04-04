package pl.imiajd.Mingielewicz.Lab12;

import java.util.*;

public class Zadanie12_07 {
    public static void main(String[] args) {
        int liczba = 24;
        System.out.println(pierwsze(liczba));
    }

    public static BitSet pierwsze(Integer liczba) {
        int primes[] = new int[10000];
        BitSet numbList = new BitSet(liczba);
        numbList.set(2, liczba);
        for (int i = 2; i*i < liczba; i++)
            if (numbList.get(i))
                for (int j = 2*i; j < liczba; j+=i)
                    numbList.clear(j);
                return numbList;
    }
}
