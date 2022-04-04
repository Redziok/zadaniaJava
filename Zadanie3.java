package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie3 {
    public static void main(String[] args) {
        int n = 5;
        int dodatnie = 0;
        int ujemne = 0;
        int zer = 0;
        int[] liczba = new int[n];
        liczba[0] = 13;
        liczba[1] = -5;
        liczba[2] = 7;
        liczba[3] = -2;
        liczba[4] = 0;

        for(int i=0 ; i < n; i++) {
            if(liczba[i]>0) {
                dodatnie = dodatnie + 1;
            }
            else if(liczba[i]<0) {
                ujemne = ujemne + 1;
            }
            else {
                zer = zer + 1;
            }
        }
        System.out.println(dodatnie + " dodatnich\n" + ujemne + " ujemnych\n" + zer + " zer");
    }
}
