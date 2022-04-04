package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

public class Zadanie11 {
    private static int silnia(int n) {
        if(n < 1)
            return 1;
        else
            return n * silnia(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        float wynika = 0;
        float wynikb = 1;
        float wynikc = 0;
        double wynikd = 0;
        float wynike = 1;
        double wynikf = 0;
        float wynikg1 = 0;
        float wynikg2 = 1;
        double wynikh = 0;
        double wyniki = 0;
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

        for(int i = 0 ; i < n; i++) {
            wynika = wynika + liczba[i];
        }
        for(int i = 0 ; i < n; i++) {
            wynikb = wynikb * liczba[i];
            }
        for(int i = 0 ; i < n; i++) {
            wynikc = wynikc + Math.abs(liczba[i]);
        }
        for(int i = 1 ; i < (n-1); i++) {
            wynikd = wynikd + Math.sqrt(Math.abs(liczba[i]));
        }
        for(int i = 0 ; i < n; i++) {
            wynike = wynike * Math.abs(liczba[i]);
        }
        for(int i = 0 ; i < n; i++) {
            wynikf = wynikf + Math.pow(liczba[i],2);
        }
        for(int i = 0 ; i < n; i++) {
            wynikg1 = wynikg1 + liczba[i];
            wynikg2 = wynikg2 * liczba[i];
        }
        for(int i = 0 ; i < n; i++) {
            wynikh = wynikh + liczba[i] * Math.pow((-1),i+1);
        }
        for(int i = 0 ; i < n; i++) {
            wyniki = wyniki + ((Math.pow((-1),i) * liczba[i])/silnia(i));
        }

        System.out.println("1a: " + wynika);
        System.out.println("1b: " + wynikb);
        System.out.println("1c: " + wynikc);
        System.out.println("1d: " + wynikd);
        System.out.println("1e: " + wynike);
        System.out.println("1f: " + wynikf);
        System.out.println("1g+: " + wynikg1);
        System.out.println("1g*: " + wynikg2);
        System.out.println("1h: " + wynikh);
        System.out.println("1i: " + wyniki);
    }
}