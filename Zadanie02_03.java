package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;
import java.io.*;
public class Zadanie02_03 {
    public static void matrix1(int m, int n, int k) {
        int suma[][] = new int[n][n];
        int pierwszamacierz[][] = { {1, 2} , {3, 4} };
        int drugamacierz[][] = { {5, 6} , {7, 8} };

        for(int i = 0 ; i < m ; i++ ) {
            for (int j = 0 ; j < n ; j++ ) {
                System.out.print(pierwszamacierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < k ; j++ ) {
                System.out.print(drugamacierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < n ; j++ ) {
                for(int q = 0 ; q < n ; q++ ) {
                    suma[i][j] += pierwszamacierz[i][q] * drugamacierz[q][j];
                }
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int k = 2;

        matrix1(m,n,k);

    }
}