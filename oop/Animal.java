package org.example.oop;

import java.util.Objects;

public class Animal extends Object implements Comparable<Animal> {
    int index;
    double height;
    double weight;
    String name;

    public Animal(int index, double height, double weight, String name) {
        this.index = index;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public void makeVoice(){
        System.out.println("Im animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        if (index > o.index){
            return 1;
        }
        if (index < o.index){
            return -1;
        }
        return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return index == animal.index;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(index);
//    }
}
