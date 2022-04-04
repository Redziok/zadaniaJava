package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.math.BigDecimal;

public class Zadanie04_05 {
    public static double kapital(int n, double k, double p) {
        String k2 = Double.toString(k);
        String p2 = Double.toString(p);
        BigDecimal b = new BigDecimal(k2);
        BigDecimal c = new BigDecimal(p2);
        BigDecimal wynik = new BigDecimal("0");

        for(int i = 0 ; i < n ; i++) {
            b = b.add(b.multiply(c));
        }
        return b.doubleValue();
    }

    public static void main(String[] args) {
        double k = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        System.out.printf("Kapitał: %.2f", kapital(n,k,p));
    }
}
