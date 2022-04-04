package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie5 {
    public static void main(String[] args) {
        int n = 5;
        int ilosc = 0;
        int[] liczba = new int[n];
        liczba[0] = 13;
        liczba[1] = 5;
        liczba[2] = 7;
        liczba[3] = -2;
        liczba[4] = 0;

        for(int i = 0 ; i < n; i++) {
            if (liczba[i] > 0 && liczba[i + 1] > 0) {
                System.out.println(liczba[i] + "," + liczba[i+1]);
                ilosc = ilosc + 1;
            }
        }
        System.out.println(ilosc + " pary");
    }
}