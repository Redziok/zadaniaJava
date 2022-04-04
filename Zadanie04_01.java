package pl.edu.uwm.wmii.michalmingielewicz.laboratorium00;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Zadanie04_01 {

    public static int CountChar(String str, char c) {
        int wystapien = 0;

        for (int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == c) {
                wystapien += 1;
            }
            }
        return wystapien;
    }

    public static int countSubStr(String str, String subStr) {
        int wystapien = 0;
        int i = 0;
        while ((i = str.indexOf(subStr, i)) != -1 ) {
            wystapien++;
            i++;
        }
        return wystapien;
    }

    public static String middle(String str) {
        char temp;
        char temp2;
        String wynik;
        if(str.length() % 2 == 0){
            temp = str.charAt(str.length()/2-1);
            temp2 = str.charAt(str.length()/2);
            wynik = String.valueOf(temp) + String.valueOf(temp2);
        }
        else{
                temp = str.charAt(str.length()/2);
                wynik = String.valueOf(temp);
        }
        return wynik;
    }

    public static String repeat(String str,int n) {
        String temp = "";
        for(int i = 0 ; i < n ; i++) {
           temp += str;
        }
        return temp;
    }

    public static int[] where(String str, String subStr) {
        int[] tab = new int[str.length()];
        int i = 0;
        while ((i = str.indexOf(subStr, i)) != -1 ) {
            tab[i] = i;
            i++;
        }
        return tab;
    }

    public static String change(String str) {
        int length = str.length();
        StringBuffer text = new StringBuffer().append(str);
        for(int i = 0 ; i < length ; i++) {
            Character a = str.charAt(i);
            if (Character.isLowerCase(a)) {
                text.replace(i, i+1, Character.toUpperCase(a)+"");
            }
            else {
                text.replace(i, i+1, Character.toLowerCase(a)+"");
            }
        }
        String zmiana = text.toString();
        return zmiana;
    }

    public static String nice(String str) {
        StringBuffer text = new StringBuffer(str);
        int length = text.length();
        int count = 0;
        for(int i = length; i > 0; i--) {

            if(count % 3 == 0 && i!=length) {
                text.insert(i, ',');
            }
            count++;
        }
        String zmiana = text.toString();
        return zmiana;
    }

    public static String nice2(String str,char znak, int n) {
        StringBuffer text = new StringBuffer(str);
        int length = text.length();
        int count = 0;
        for(int i = length; i > 0; i--) {

            if(count % n == 0 && i!=length) {
                text.insert(i, znak);
            }
            count++;
        }
        String zmiana = text.toString();
        return zmiana;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String napis = "cycyliaa";
        char znak = 'c';
        String napis2 = "Ala ma kota, Ala ma psa";
        String napis3 = "Ala";
        String numer = "0123456789";
        int[] wynik = where(napis2,napis3);

    System.out.println("wystąpień " + znak + ": " + CountChar(napis,znak));
    System.out.println("wystąpień " + napis3 + ": " + countSubStr(napis2,napis3));

    for(int i = 0 ; i < wynik.length ; i++) {
        if(wynik[i] == i) {
            System.out.print("Index: " + wynik[i] + " ");
        }
    }

    System.out.println("\n" + change(napis2));
    System.out.println(nice(numer));
    System.out.println(nice2(numer,'|',3));



//    System.out.println("Podaj tekst do middle: ");
//    String napis4 = scan.nextLine();
//    System.out.println("Środkowy znak: "+ middle(napis4));
//
//    System.out.println("Podaj tekst do repeat: ");
//    String napis5 = scan.nextLine();
//    System.out.println(repeat(napis5,4));

    }
}