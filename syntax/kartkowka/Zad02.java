package org.example.syntax.kartkowka;

public class Zad02 {
    public static void print(String[] arr){
        for (String element: arr){
            System.out.println(element);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"3424", "dsgsfg"};
        print(arr);
    }
}
