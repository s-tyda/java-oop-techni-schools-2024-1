package org.example.oop.abstraction;

import org.example.oop.abstraction.figures.Figure;
import org.example.oop.abstraction.figures.Square;
import org.example.oop.abstraction.vehicles.Car;
import org.example.oop.abstraction.vehicles.Plane;
import org.example.oop.abstraction.vehicles.Vehicle;

public class Main {
    public static void makeBulkVoice(Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles){
            vehicle.makeVoice();
        }
    }

    public static void main(String[] args) {
        Car car = new Car(3432f,324324f, 24324f, "Fiat", "Punto", 3);
        Plane plane = new Plane(34324234f, 42542542f, 4352455f, "Boeing", "9/11");
        Vehicle[] vehicles = new Vehicle[]{car, plane};
        makeBulkVoice(vehicles);
        Figure square1 = new Square(5);
        System.out.println(square1.area());
    }
}
