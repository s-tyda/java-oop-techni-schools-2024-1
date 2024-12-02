package org.example.oop;

public class Animal extends Object {
    double height;
    double weight;
    String name;

    public Animal(double height, double weight, String name) {
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
}
