package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.io.*;
import java.util.Scanner;

public class Zadanie04_02 {

    public static int CountChar(File plik, char znak) throws IOException {
        int wystapien = 0;
        int znakow = 0;

        FileInputStream fileStream = new FileInputStream(plik);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader czytaj = new BufferedReader(input);
        String text;

        while((text = czytaj.readLine()) != null) {
            znakow += text.length();
            for(int i = 0 ; i < znakow ; i++) {
                if(text.charAt(i) == znak) {
                    wystapien++;
                }
            }
        }

        return wystapien;
    }

    public static void main(String[] args) throws IOException {

        File plik = new File(args[0]);

    System.out.println(CountChar(plik,args[1].charAt(0)));

    }
}
