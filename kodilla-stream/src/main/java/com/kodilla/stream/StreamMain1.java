package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.StringJoiner;

public class StreamMain1 {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("ala", a -> a.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Kodilla", a -> {
            String result = "";
            StringJoiner joiner = new StringJoiner(" ");
            for (int i = 0; i < a.length(); i++) {
                result = joiner.add(a.substring(i, i + 1)).toString();
            }
            return result;
        }));
        System.out.println(poemBeautifier.beautify("ale jestem śpiący", a -> {

            char[] array = a.toCharArray();
            String characterToString = Character.toString(array[0]);

            for (int i = 0; i < array.length; i++) {
                int counter = 1;
                for (int c = counter; c < i + 1; c++) {
                    characterToString = characterToString + Character.toString(array[i]);
                    counter++;
                }
            }
            return characterToString;
        }));
    }
}



