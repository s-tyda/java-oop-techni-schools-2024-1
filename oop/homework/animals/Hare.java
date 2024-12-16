package org.example.oop.homework.animals;

public class Hare extends Animal{
    public Hare(int age, boolean sex) {
        super(age, sex);
    }

    @Override
    public boolean grow() {
        this.setAge(this.getAge() + 1);
        return this.getAge() > 5;
    }
}
