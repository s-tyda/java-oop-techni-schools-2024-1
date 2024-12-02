package org.example.oop.abstraction.vehicles;

public class Car extends Vehicle{
    private int numberOfCarDoors;

    public Car(float height, float width, float weight, String manufacturer, String model, int numberOfCarDoors) {
        super(height, width, weight, manufacturer, model);
        this.numberOfCarDoors = numberOfCarDoors;
    }

    @Override
    public void makeVoice() {
        System.out.println("brr im a car");
    }
}
