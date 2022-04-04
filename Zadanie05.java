package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.lang.reflect.Array;
import java.util.*;

public class Zadanie05 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        Iterator<Integer> lengthA = a.iterator();
        Iterator<Integer> lengthB = b.iterator();

        while(lengthA.hasNext() || lengthB.hasNext()) {
            if(lengthA.hasNext()) {
                c.add(lengthA.next());
            }
            if(lengthB.hasNext()) {
                c.add(lengthB.next());
            }
        }
        return c;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        c.sort(Comparator.naturalOrder());
        return c;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = a.size()-1; i >= 0 ; i--) {
            c.add(a.get(i));
        }
        return c;
    }

    public static void reverse(ArrayList<Integer> a) {
        int temp;
        for(int i = a.size()-1; i >= 0 ; i--) {
            a.add(a.get(i));
        }
        for(int i = 0; i < a.size()-1 ; i++) {
            a.remove(a.get(i));
        }
        System.out.println("Reverse a: " + a);
    }



    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(4);a.add(9);a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);b.add(7);b.add(4);b.add(9);b.add(11);

        System.out.println("Lista a: " + a);
        System.out.println("Lista b: " + b);
        System.out.println("Append: " + append(a,b));
        System.out.println("Merge: " + merge(a,b));
        System.out.println("Sorted: " + mergeSorted(a,b));
        System.out.println("Reversed a: " + reversed(a));
        reverse(a);

    }
}
