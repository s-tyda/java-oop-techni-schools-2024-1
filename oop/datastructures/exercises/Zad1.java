package org.example.oop.datastructures.exercises;

import java.util.*;

public class Zad1 {
    public static Set<Character> getAlphabet(String message){
        Set<Character> result = new LinkedHashSet<>();

        for (int i = 0; i < message.length(); i++) {
            result.add(message.charAt(i));
        }

        return new HashSet<>();
    }

    public static void main(String[] args) {
        System.out.println(getAlphabet("alicja"));
    }
}
