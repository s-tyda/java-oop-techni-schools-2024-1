package org.example.oop;

public class Cat extends Animal{
    public Cat(double height, double weight, String name) {
        super(height, weight, name);
    }

    @Override
    public void makeVoice() {
        System.out.println("Im cat");
    }
}
