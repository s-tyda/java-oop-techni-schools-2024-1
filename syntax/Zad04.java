package org.example.syntax;

public class Zad04 {
    public static void main(String[] args) {
//        4. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
        int x = 10;
        while(x <= 20){
            System.out.println(x);
            x++;
        }

        for(int i = -10; i < 40; i++){
            if(i % 2 != 1 && i % 2 != -1){
                System.out.println(i);
            }
        }
    }
}
