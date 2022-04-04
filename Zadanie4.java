package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie4 {
    public static void main(String[] args) {
        int n = 5;
        int najmniej = 500;
        int najwiek = -500;
        int[] liczba = new int[n];
        liczba[0] = 13;
        liczba[1] = -5;
        liczba[2] = 7;
        liczba[3] = -2;
        liczba[4] = 0;

        for(int i=0 ; i < n; i++) {
            if (liczba[i] < najmniej) {
                najmniej = liczba[i];
            }
        }
        for(int i=0 ; i < n; i++) {
            if (liczba[i] > najwiek) {
                najwiek = liczba[i];
            }
        }
        System.out.println("najwieksza: " + najwiek + "\nnajmniejsza: " + najmniej);
    }
}
