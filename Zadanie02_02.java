package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie02_02 {
    private static final int n = 10;
    static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        for (int i = 0 ; i < n ; i++ ) {
            tab[i] = (int) (Math.random() * ((maxWartosc - minWartosc) + 1)) + minWartosc;
            System.out.print(tab[i] + " ");
        }
    }
    public static int ileNieparzystych(int tab[]) {
        int nieparzyste = 0;

        for (int i = 0 ; i < n ; i++) {
            if (tab[i] % 2 != 0) {
                nieparzyste += 1;
            }
        }
        return nieparzyste;
    }
    public static int ileParzystych(int tab[]) {
        int parzyste = 0;

        for (int i = 0 ; i < n ; i++) {
            if (tab[i] % 2 == 0) {
                parzyste += 1;
            }
        }
        return parzyste;
    }
    public static int ileDodatnich(int tab[]) {
        int dodatnie = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] > 0) {
                dodatnie += 1;
            }
        }
            return dodatnie;
    }
    public static int ileUjemnych(int tab[]) {
        int ujemne = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] < 0) {
                ujemne += 1;
            }
        }
        return ujemne;
    }
    public static int ileZerowych(int tab[]) {
        int zerowe = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] == 0) {
                zerowe += 1;
            }
        }
        return zerowe;
    }
    public static int ileMaksymalnych(int tab[]) {
        int najwiekszy = -1000;
        int wystepuje = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] > najwiekszy) {
                najwiekszy = tab[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] == najwiekszy) {
                wystepuje += 1;
            }
        }
        return wystepuje;
    }
    public static int sumaDodatnich(int tab[]) {
        int sumaDodatnich = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] > 0) {
                sumaDodatnich += tab[i];
            }
        }
        return sumaDodatnich;
    }
    public static int sumaUjemnych(int tab[]) {
        int sumaUjemnych = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] < 0) {
                sumaUjemnych += tab[i];
            }
        }
        return sumaUjemnych;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int dlugosc = 1;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            if (tab[i] > 0 && tab[i + 1] > 0) {
                dlugosc += 1;
            } else if (tab[i] > 0 && tab[i + 1] < 0) {
                if (dlugosc > temp) {
                    temp = dlugosc;
                }
                dlugosc = 1;
            }
        }
        if (dlugosc > temp) {
            return dlugosc;
        } else {
            return temp;
        }
    }
    public static void signum(int tab[]) {
        int[] liczba2 = new int[n]; ;
        for (int i = 0; i < n; i++) {
            if (tab[i] > 0) {
                liczba2[i] = 1;
            } else if (tab[i] < 0) {
                liczba2[i] = -1;
            }
            System.out.print(liczba2[i] + "   ");
        }
    }
    public static void odwrocFragment(int tab[],int lewy,int prawy) {
        int[] liczba3 = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < lewy - 1 || i > prawy - 1) {
                liczba3[i] = tab[i];
            } else if (i >= lewy - 1 && i <= prawy - 1) {
                int przesuniecieZLewej = lewy - 1;
                for (int j = prawy - 1; j >= lewy - 1; j--) {
                    przesuniecieZLewej++;
                    liczba3[przesuniecieZLewej - 1] = tab[j];
                }
            }
            System.out.print(liczba3[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] liczba = new int[n];
        int minWartosc = -999;
        int maxWartosc = 999;
        int lewy = 4;
        int prawy = 7;

        generuj(liczba,n,minWartosc,maxWartosc);
        System.out.println("\n");
        signum(liczba);
        System.out.println("\n");
        odwrocFragment(liczba,lewy,prawy);
        System.out.println("\n");
        System.out.println("Nieparzystych : " + ileNieparzystych(liczba));
        System.out.println("Parzystych : " + ileParzystych(liczba));
        System.out.println("Dodatnie : " + ileDodatnich(liczba));
        System.out.println("Ujemne : " + ileUjemnych(liczba));
        System.out.println("Zerowe : " + ileZerowych(liczba));
        System.out.println("Element maksymalny występuje : " + ileMaksymalnych(liczba) + " razy");
        System.out.println("Suma Dodatnich : " + sumaDodatnich(liczba));
        System.out.println("Suma Ujemnych : " + sumaUjemnych(liczba));
        System.out.println("Najdłuższy ciąg dodatnich liczb : " + dlugoscMaksymalnegoCiaguDodatnich(liczba));
    }
}
