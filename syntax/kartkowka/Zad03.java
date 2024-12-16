package org.example.syntax.kartkowka;

public class Zad03 {
    public static int sum(int[] arr){
        int result = 0;
        for (int el: arr) {
            result += el;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7};
        System.out.println(sum(arr));
    }
}
