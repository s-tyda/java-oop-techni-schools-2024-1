package org.example.syntax;

public class Zad07 {
    public static void main(String[] args) {
        int board[] = {1, 2, 5, 7, 3};
        int sum = 0;
        for (int i=0; i<board.length; i++) {
            sum = sum + board[i];
        }
        System.out.println(sum);
    }
}
