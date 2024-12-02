package org.example.syntax;

public class Zad08 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -2, -3};
        int max = arr[0];
        for (int num :arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
