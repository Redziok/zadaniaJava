package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie12 {
    public static void main(String[] args) {
        int n = 10;
        float[] nciag = new float[n];
        float[] liczba = new float[n];
        liczba[0] = 1;
        liczba[1] = 2;
        liczba[2] = 3;
        liczba[3] = -1;
        liczba[4] = -2;
        liczba[5] = -3;
        liczba[6] = 4;
        liczba[7] = 10;
        liczba[8] = -10;
        liczba[9] = 5;

        for(int i = 1 ; i < n; i++) {
            System.out.println(liczba[i]);
        }
        System.out.println(liczba[0]);

    }
}