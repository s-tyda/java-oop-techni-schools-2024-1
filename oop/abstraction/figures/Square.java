package org.example.oop.abstraction.figures;

public class Square implements Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}
