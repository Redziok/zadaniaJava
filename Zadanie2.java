package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie2 {
    public static void main(String[] args) {
        int n = 5;
        int suma = 0;
        int[] liczba = new int[5];
        liczba[0] = 13;
        liczba[1] = -5;
        liczba[2] = 7;
        liczba[3] = -2;
        liczba[4] = 1;

        for(int i=0 ; i < n; i++) {
            if(liczba[i]>0) {
                suma = suma + liczba[i];
            }
        }
        suma = suma * 2;
        System.out.println(suma);
    }
}