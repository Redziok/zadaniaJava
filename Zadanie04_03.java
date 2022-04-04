package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.io.*;
import java.util.Scanner;

public class Zadanie04_03 {

    public static int CountChar(File plik, String subStr) throws IOException {
        int wystapien = 0;
        int znakow = 0;

        FileInputStream fileStream = new FileInputStream(plik);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader czytaj = new BufferedReader(input);
        String text;

        while((text = czytaj.readLine()) != null) {
            znakow += text.length();
                int i = 0;
                while ((i = text.indexOf(subStr, i)) != -1 ) {
                    wystapien++;
                    i++;
                }
            }
        return wystapien;
    }


    public static void main(String[] args) throws IOException {

        File plik = new File(args[0]);

        System.out.println(CountChar(plik,args[1]));

    }
}