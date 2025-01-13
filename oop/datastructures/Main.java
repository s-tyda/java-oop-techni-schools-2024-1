package org.example.oop.datastructures;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println(list);

        list.add("Xgbjdfbjkdfgkjds");
        list.add("Xgbjdfbjkdfgkjdsfvdsfs");
        list.add("Xgbjdfbjkdfgkjdsfdvdfgdfg");
        System.out.println(list);

        list.add(1, "test");
        System.out.println(list);

        list.remove(0);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(0));

        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(sum(list1));
    }
}
