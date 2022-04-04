package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie1a {
    private static int silnia(int n) {
        if(n < 1)
            return 1;
        else
            return n * silnia(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        int ilosca = 0;
        int iloscb = 0;
        int iloscc = 0;
        int iloscd = 0;
        int ilosce = 0;
        int iloscf = 0;
        int iloscg = 0;
        int ilosch = 0;
        float[] liczba = new float[n];
        liczba[0] = 13;
        liczba[1] = 5;
        liczba[2] = 12;
        liczba[3] = -2;
        liczba[4] = 0;
        liczba[5] = 33;
        liczba[6] = 16;
        liczba[7] = -9;
        liczba[8] = 8;
        liczba[9] = 0;

        for(int i = 0 ; i < n; i++) {
            if (liczba[i] % 2 != 0) {
                ilosca = ilosca + 1;
            }
        }
        for(int i = 0 ; i < n; i++) {
            if (liczba[i] % 3 == 0 && liczba[i] % 5 != 0) {
                iloscb = iloscb + 1;
            }
        }
        for(int i = 0 ; i < n; i++) {
            if (Math.sqrt(liczba[i]) % 2 == 0) {
                iloscc = iloscc + 1;
            }
        }
         for(int i = 1 ; i < (n-1); i++) {
            if (liczba[i]<(liczba[i-1]+liczba[i+1])/2) {
                iloscd = iloscd + 1;
            }
        }
        for(int i = 0 ; i < n; i++) {
            if (Math.pow(2,i) < liczba[i] && liczba[i] < silnia(i)) {
                ilosce = ilosce + 1;
            }
        }
         for(int i = 0 ; i < n; i++) {
            if (i % 2 != 0 && liczba[i] % 2 == 0) {
                iloscf = iloscf + 1;
            }
        }
        for(int i = 0 ; i < n; i++) {
            if (liczba[i] > 0 && liczba[i] % 2 != 0) {
                iloscg = iloscg + 1;
            }
        }
        for(int i = 0 ; i < n; i++) {
            if (Math.abs(liczba[i]) < Math.pow(i,2)) {
                ilosch = ilosch + 1;
            }
        }

        System.out.println("1a: " + ilosca);
        System.out.println("1b: " + iloscb);
        System.out.println("1c: " + iloscc);
        System.out.println("1d: " + iloscd);
        System.out.println("1e: " + ilosce);
        System.out.println("1f: " + iloscf);
        System.out.println("1g: " + iloscg);
        System.out.println("1h: " + ilosch);
    }
}
