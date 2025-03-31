package org.example.oop.datastructures;
import java.util.HashMap;

public class Zad {
    public static HashMap<Character, Integer> getLetters(String word){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<word.length(); i++){
            char letter = word.charAt(i);

            map.putIfAbsent(letter, 0);
            map.put(letter, map.get(letter)+1);

//            if(map.containsKey(letter)){
//                map.put(letter, map.get(letter)+1);
//            }else{
//                map.put(letter, 1);
//            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getLetters("alicja"));
    }
}
