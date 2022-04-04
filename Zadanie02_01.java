package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;
import java.util.Random;
public class Zadanie02_01 {


    public static void main(String[] args) {
        int n = 10;
        int parzyste = 0;
        int nieparzyste = 0;
        int dodatnie = 0;
        int ujemne = 0;
        int zerowe = 0;
        int najwiekszy = -1000;
        int wystepuje = 0;
        int sumadod = 0;
        int sumaujemn = 0;
        int dlugosc = 1;
        int lewy = 4;
        int prawy = 7;
        int temp = 0;
        int[] liczba2 = new int[n];
        int[] liczba3 = new int[n];


        Random r = new Random();
        int[] liczba = new int[n];
        for (int i = 0; i < n; i++) {
            liczba[i] = r.nextInt(1999) - 999;
        }

        for (int i = 0; i < n; i++) {
            if (liczba[i] % 2 == 0) {
                parzyste = parzyste + 1;
            } else nieparzyste = nieparzyste + 1;
        }
        System.out.println("parzyste: " + parzyste);
        System.out.println("nieparzyste: " + nieparzyste);

        for (int i = 0; i < n; i++) {
            if (liczba[i] > 0) {
                dodatnie = dodatnie + 1;
            } else if (liczba[i] < 0) {
                ujemne = ujemne + 1;
            } else zerowe = zerowe + 1;
        }
        System.out.println("dodatnie: " + dodatnie);
        System.out.println("ujemne: " + ujemne);
        System.out.println("zerowe: " + zerowe);

        for (int i = 0; i < n; i++) {
            if (liczba[i] > najwiekszy) {
                najwiekszy = liczba[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (liczba[i] == najwiekszy) {
                wystepuje = wystepuje + 1;
            }
        }
        System.out.println("najwiekszy: " + najwiekszy);
        System.out.println("wystepuje: " + wystepuje + " razy");

        for (int i = 0; i < n; i++) {
            if (liczba[i] > 0) {
                sumadod = sumadod + liczba[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (liczba[i] < 0) {
                sumaujemn = sumaujemn + liczba[i];
            }
        }
        System.out.println("suma dodatnich: " + sumadod);
        System.out.println("suma ujemnych: " + sumaujemn);

        for (int i = 0; i < n - 1; i++) {
            if (liczba[i] > 0 && liczba[i + 1] > 0) {
                dlugosc += 1;
            } else if (liczba[i] > 0 && liczba[i + 1] < 0) {
                if (dlugosc > temp) {
                    temp = dlugosc;
                }
                dlugosc = 1;
            }
        }
        if (dlugosc > temp) {
            System.out.println("długość dodatnich: " + dlugosc);
        } else {
            System.out.println("długość dodatnich: " + temp);
        }

        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            if (liczba[i] > 0) {
                liczba2[i] = 1;
            } else if (liczba[i] < 0) {
                liczba2[i] = -1;
            }
            System.out.println(liczba2[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println(liczba[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            if (i < lewy - 1 || i > prawy - 1) {
                liczba3[i] = liczba[i];
            } else if (i >= lewy - 1 && i <= prawy - 1) {
                int przesuniecieZLewej = lewy - 1;
                for (int j = prawy - 1; j >= lewy - 1; j--) {
                    przesuniecieZLewej++;
                    liczba3[przesuniecieZLewej - 1] = liczba[j];
                }
            }
            System.out.println(liczba3[i]);
        }
    }
}
