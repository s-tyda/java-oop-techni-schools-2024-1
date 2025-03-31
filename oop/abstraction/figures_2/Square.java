package org.example.oop.abstraction.figures_2;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}
