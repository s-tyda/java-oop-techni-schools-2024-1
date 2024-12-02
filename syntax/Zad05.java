package org.example.syntax;

public class Zad05 {
    public static void main(String[] args) {
        for(int i = -10; i < 40; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        for(int i = -9; i < 40; i +=2){
            System.out.println(i);
        }

    }
}

