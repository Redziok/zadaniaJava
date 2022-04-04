package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.util.*;


public class Test_01 {

    public static void pierwsze(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = 0 ; i < a.size()-1 ; i++) {
            for(int j = 0 ; j < b.size()-1 ; i++) {
                if(a.get(i) != b.get(j)) {
                    c.add(i);
                }
            }
        }
        c.sort(Comparator.naturalOrder());
        return c;
    }


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(4);a.add(9);a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);b.add(7);b.add(4);b.add(9);b.add(11);


//        pierwsze(10);
        System.out.println("MergeSorted: " + mergeSorted(a,b));

    }
}
