package org.example.oop.homework.animals;

public abstract class Animal {
    private int age;
    private boolean sex;

    public Animal(int age, boolean sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public abstract boolean grow();
}
