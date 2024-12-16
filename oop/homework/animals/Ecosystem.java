package org.example.oop.homework.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ecosystem {
    private List<Animal> animals;

    public Ecosystem(List<Animal> animals) {
        this.animals = animals;
    }

    public void report(){
        int maleHareCount = 0;
        int femaleHareCount = 0;
        int maleMacaqueCount = 0;
        int femaleMacaqueCount = 0;
        for (Animal animal: animals){
            if (animal instanceof Macaque) {
                if (animal.isSex()){
                    maleMacaqueCount++;
                }else {
                    femaleMacaqueCount++;
                }
            }
            else if (animal instanceof Hare){
                if (animal.isSex()){
                    maleHareCount++;
                }else {
                    femaleHareCount++;
                }
            }
        }
        System.out.println("Liczba makaków samców: " + maleMacaqueCount);
        System.out.println("Liczba makaków samic: " + femaleMacaqueCount);
        System.out.println("Liczba zająców samców: " + maleHareCount);
        System.out.println("Liczba zająców samic: " + femaleHareCount);
    }

    public void step(){
        List<Animal> newAnimals = new ArrayList<>();
        for (Animal animal: animals){
            if (!animal.grow()){
                newAnimals.add(animal);
            }
        }

        int maleHareCount = 0;
        int femaleHareCount = 0;
        int maleMacaqueCount = 0;
        int femaleMacaqueCount = 0;
        for (Animal animal: animals){
            if (animal instanceof Macaque && animal.getAge() >= 3) {
                if (animal.isSex()){
                    maleMacaqueCount++;
                }else {
                    femaleMacaqueCount++;
                }
            }
            else if (animal instanceof Hare && animal.getAge() >= 1){
                if (animal.isSex()){
                    maleHareCount++;
                }else {
                    femaleHareCount++;
                }
            }
        }

        int newHares = Math.min(maleHareCount, femaleHareCount) * 2;
        int newMacaques = Math.min(maleMacaqueCount * 2, femaleMacaqueCount);

        Random random = new Random();
        for (int i = 0; i < newHares; i++) {
            Animal hare = new Hare(0, random.nextBoolean());
            newAnimals.add(hare);
        }

        for (int i = 0; i < newMacaques; i++) {
            Animal macaque = new Macaque(0, random.nextBoolean());
            newAnimals.add(macaque);
        }

        this.animals = newAnimals;
    }
}
