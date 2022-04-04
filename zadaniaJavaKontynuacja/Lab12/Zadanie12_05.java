package pl.imiajd.Mingielewicz.Lab12;

import java.util.*;
import java.util.regex.*;

public class Zadanie12_05 {
    public static void main(String[] args) {
        var test = "Ala ma kota. Jej kot lubi myszy.";
        System.out.println(reverse(test));

    }
    public static String reverse(String zdanie) {
        StringBuilder result = new StringBuilder();
        Stack<String> zdania = new Stack<>();
        String[] arr = zdanie.trim().split("\\s");
        Stack<String> stack = new Stack<>();
        boolean nastepneZdanie = false;
        for(String word : arr) {
            stack.push(word);
        }
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()) {
            if(stack.peek().contains(".")) {
                nastepneZdanie = true;
                var text = stack.pop();
                var capitalLetter = text.substring(0, 1).toUpperCase() + text.substring(1, text.length()-1);
                text = capitalLetter;
                builder.append(text).append(" ");
            }
            if(Character.isUpperCase(stack.peek().toCharArray()[0])) {
                var text = stack.pop();
                var lowerCaseLetter = text.substring(0, 1).toLowerCase() + text.substring(1);
                text = lowerCaseLetter;
                builder.append(text).append(".").append(" ");
                if(nastepneZdanie) {
                    zdania.push(builder.toString());
                    builder.delete(0, builder.length());
                    nastepneZdanie = false;
                }
            }
            if(!stack.isEmpty() && !Character.isUpperCase(stack.peek().toCharArray()[0]) && !stack.peek().contains(".")) {
                var text = stack.pop();
                builder.append(text).append(" ");
            }

        }
        while(!zdania.isEmpty()) {
            result.append(zdania.pop());
        }
        return result.toString();
    }
}
