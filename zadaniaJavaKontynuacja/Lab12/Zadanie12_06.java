package pl.imiajd.Mingielewicz.Lab12;

import java.util.*;

public class Zadanie12_06 {
    public static void main(String[] args) {
        int liczba = 9812;
        System.out.println(reverse(liczba));
    }

    public static Integer reverse(Integer liczba) {
        Stack<Integer> stack = new Stack<>();

        while (liczba != 0) {
            stack.push(liczba % 10);
            liczba = liczba / 10 ;
        }
        int odwroc = 0;
        int j = 1;

        while(!stack.empty()) {
            odwroc = odwroc + (stack.peek() * j);
            stack.pop();
            j = j * 10;
        }
        return odwroc;
    }
}
