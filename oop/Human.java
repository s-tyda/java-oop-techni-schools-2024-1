package org.example.oop;

public class Human extends Animal {
    public Human(double height, double weight, String name) {
        super(height, weight, name);
    }

    @Override
    public void makeVoice() {
//        super.makeVoice();
        System.out.println("Im human");
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
