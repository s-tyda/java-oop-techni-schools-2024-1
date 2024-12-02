package org.example.syntax;

public class Zad22 {
    public static int getSmthIdk(int[] args)
    {
        int x = 0;
        for (int element : args)
        {
            x = x == 0 ? element : x * element;
        }

        return x;
    }
}
