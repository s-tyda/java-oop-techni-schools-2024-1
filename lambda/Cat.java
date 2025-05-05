package org.example.lambda;

public class Cat implements Printable{
    protected int age;

    @Override
    public void print(String x) {
        System.out.println("Meow " + x);
    }

    public Cat incrementAge(){
        age += 1;
        return this;
    }
}
