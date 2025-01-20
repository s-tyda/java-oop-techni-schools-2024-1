package org.example.oop;

public class Cat extends Animal{
    public Cat(int index, double height, double weight, String name) {
        super(index, height, weight, name);
    }

    @Override
    public void makeVoice() {
        System.out.println("Im cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "index=" + index +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
