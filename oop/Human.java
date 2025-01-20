package org.example.oop;

public class Human extends Animal {
    public Human(int index, double height, double weight, String name) {
        super(index, height, weight, name);
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
