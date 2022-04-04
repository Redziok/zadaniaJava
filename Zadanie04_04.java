package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.math.BigInteger;

public class Zadanie04_04 {
    public static int szach(int n) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger ziaren = new BigInteger("0");

        ziaren = ziaren.add(b.pow((n*n))).subtract(a);

        return ziaren.intValue();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Suma ziaren: " + szach(n));
    }
}
