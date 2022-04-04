package pl.imiajd.Mingielewicz.Zad10;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> plik = new ArrayList<>();

        String text = bufReader.readLine();
        while (text != null) {
            plik.add(text);
            text = bufReader.readLine();
       }
        bufReader.close();
        System.out.println(plik);
        Collections.sort(plik);
        System.out.println(plik);
    }
}
