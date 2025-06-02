package org.example.oop.datastructures.exam;

import java.util.*;

public class Main {
    public static boolean isPerfectPangram(String string) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        string = string.toLowerCase();
        string = string.replaceAll("\\s", "");
        return isAnagram(string, alphabet);
    }

    public static boolean isPangram(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("\\s+", "");
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            characters.add(string.charAt(i));
        }
        return characters.size() == 26;
    }

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.replaceAll(" ", "").toLowerCase();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr2, arr1);
    }

    public static boolean isAnagram2(String word1, String word2) {
        List<Character> arr1 = new ArrayList<>();
        List<Character> arr2 = new ArrayList<>();
        for (int i = 0; i < word1.length(); i++) {
            arr1.add(word1.charAt(i));
        }
        for (int i = 0; i < word2.length(); i++) {
            arr2.add(word2.charAt(i));
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        return arr2.equals(arr1);
    }

    public static Set<Character> letters(String text) {
        Set<Character> set = new LinkedHashSet<>();
        text = text.toLowerCase();
        for (int i=0; i<text.length(); i++) {
            set.add(text.charAt(i));
        }
//        for (char element: text.toCharArray()){
//            set.add(element);
//        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectPangram("Cwm fjord glyphs vext bank quiz"));
        System.out.println(isPangram("Waltz bad nymph for quick jigs vex"));
    }
}
