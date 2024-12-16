package org.example.oop.homework.animals;

public class Macaque extends Animal{
    public Macaque(int age, boolean sex) {
        super(age, sex);
    }

    @Override
    public boolean grow() {
        this.setAge(this.getAge() + 1);
        return this.getAge() > 27;
    }
}
