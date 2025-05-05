package org.example;

import org.example.syntax.Zad22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int sum(int a, int b){
        return a + b;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
//        // Typy prymitywne
//        int x = 5;
//        System.out.println(x);
//        int y = x;
//        System.out.println(y);
//        y = 15;
//        System.out.println(y);
//        System.out.println(x);
//
//        // Typy złożone
//        List<Integer> list = new ArrayList<>();
//        list.add(x);
//        list.add(y);
//        System.out.println(list);
//        List<Integer> list2 = list;
//        System.out.println(list2);
//        list2.remove(0);
//        System.out.println(list2);
//        System.out.println(list);
//
//        // String vs char
//        String string = "Powódź we Wrocławiu";
//        System.out.println(string);
//
//        char character = 's';
//        System.out.println(character);
//
//        // boolean z małej
//        boolean z = true;
//
//        // tablice
//        String[] arr = new String[4];
//        int[] tab = new int[5];
//        tab[0] = 3;
//        System.out.println(Arrays.toString(tab));
//
//        int[] tab2 = new int[]{5, 34, 43, 23445345};
//        System.out.println(Arrays.toString(tab2));
//
//        int[][] tab3 = new int[5][];
//        System.out.println(Arrays.toString(tab3));
//        tab3[0] = new int[2];
//        System.out.println(Arrays.toString(tab3));
//        tab3[0][1] = 3;
//
//        // pętle
//        for (int i = 0; i < 4;i++) {
//            System.out.println(tab2[i]);
//        }
//
//        // while
//        int i = 0;
//        while(i < 4){
//            System.out.println(tab2[i]);
//            i++;
//        }
//
//        // for each
//        System.out.println("FOREACH");
//        for (int element: tab2){
//            System.out.println(element);
//        }
//
//        int n = 0;
//        // TO JEST TO SAMO
//        n++;
//        n += 1;
//        n = n + 1;

//        int result = sum(4, 6);
//        System.out.println(result);
//        System.out.println(sum(5, 8));
//        print("Hello World");
//        // To jest błąd
////        System.out.println(print("cos"));
//        sum(10, 20);
//        int x = 8;
//        System.out.println(sum(x, result));
//
//        double result2 = Math.pow(10, 1d/3);
//
//        System.out.println(Zad22.getSmthIdk(new int[]{1,2,3,4,5,6}));

        List<String> list = Arrays.asList("a" ,"b", "c");

        list.stream()
                .filter(elem -> elem.equals("a"))
                .map(elem -> elem.toLowerCase());
//                .filter(elem -> System.out.println(elem));
    }
}