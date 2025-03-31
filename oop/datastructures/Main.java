package org.example.oop.datastructures;

import org.example.oop.Animal;
import org.example.oop.Cat;

import java.util.*;
import java.util.LinkedList;

public class Main {
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        System.out.println(list);
//
//        list.add("Xgbjdfbjkdfgkjds");
//        list.add("Xgbjdfbjkdfgkjdsfvdsfs");
//        list.add("Xgbjdfbjkdfgkjdsfdvdfgdfg");
//        System.out.println(list);
//
//        list.add(1, "test");
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list.size());
//        System.out.println(list);
//
//        System.out.println(list.get(0));
//
//        List<Integer> list1 = new LinkedList<>();
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        System.out.println(sum(list1));
//
        Cat cat1 = new Cat(2, 34, 345345, "maciek");
        Cat cat2 = new Cat(1, 5324, 46536, "dsgsdg");
        Cat cat3 = new Cat(2, 234235, 325325, "asdasd");
        Cat cat4 = new Cat(2, 234235, 325325, "asdasd");
//        Set<Cat> set = new TreeSet<>();
//        set.add(cat1);
//        set.add(cat2);
//        set.add(cat3);
//        set.add(cat4);
//        set.add(cat1);
//        set.add(cat2);
//        set.add(cat3);
//        set.add(cat4);
//        System.out.println(set);
//        System.out.println(cat1.compareTo(cat2));
//
//        String string = "alicja";
//        System.out.println(string.charAt(0));
//        System.out.println(cat2.equals(cat3));
//        for (Cat cat: set){
//            cat.makeVoice();
//        }

        Set<String> set = new HashSet<>();
        set.add("dafdsf");

        Map<String, Animal> map = new TreeMap<>();
        map.put(cat1.getName(), cat1);
        map.get(cat1.getName()).makeVoice();
        map.put(cat2.getName(), cat2);
        map.put(cat3.getName(), cat3);
        map.put(cat4.getName(), cat4);
        System.out.println(map.keySet());

        for (String key: map.keySet()){
            System.out.println(key);
            map.get(key).makeVoice();
        }

        for (Map.Entry<String, Animal> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("--------------");

        for (Animal animal: map.values()){
            System.out.println(animal);
        }
    }
}
