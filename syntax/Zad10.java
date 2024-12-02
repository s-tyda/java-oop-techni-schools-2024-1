package org.example.syntax;

public class Zad10 {
    public static int sum(int[] tab1) {
        return tab1[0] + tab1[1];
    }

    public static void main(String[] args) {
        int[] tab = new int[]{1,4};
        System.out.println(sum(tab));
    }

}
