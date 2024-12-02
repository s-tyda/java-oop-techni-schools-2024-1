package org.example.syntax;

public class Zad11 {
    public static double sum(int[] arr){
        double sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static double function(int[] arr1, int[] arr2){
        double avg1 = sum(arr1)/arr1.length;
        double avg2 = sum(arr2)/arr2.length;
        return (avg1+avg2)/2;
    }
    public static void main(String[] args) {
        System.out.println(function(new int[]{3,4,5}, new int[]{4,5,2}));
    }
}
