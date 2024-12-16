package org.example.oop.homework.animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();

        Animal hare1 = new Hare(2, true);
        Animal hare2 = new Hare(2, true);
        Animal hare3 = new Hare(2, true);
        Animal hare4 = new Hare(2, true);
        Animal hare5 = new Hare(2, true);
        Animal hare6 = new Hare(2, false);
        Animal hare7 = new Hare(2, false);
        Animal hare8 = new Hare(2, false);
        Animal hare9 = new Hare(2, false);
        list.add(hare1);
        list.add(hare2);
        list.add(hare3);
        list.add(hare4);
        list.add(hare5);
        list.add(hare6);
        list.add(hare7);
        list.add(hare8);
        list.add(hare9);

        Animal mac1 = new Macaque(2, true);
        Animal mac2 = new Macaque(2, true);
        Animal mac3 = new Macaque(2, false);
        Animal mac4 = new Macaque(2, false);
        Animal mac5 = new Macaque(2, false);
        list.add(mac1);
        list.add(mac2);
        list.add(mac3);
        list.add(mac4);
        list.add(mac5);
        Ecosystem ecosystem = new Ecosystem(list);
        ecosystem.step();
        ecosystem.report();
    }
}
