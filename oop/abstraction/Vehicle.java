package org.example.oop.abstraction;

public abstract class Vehicle {
    private float height;
    private float width;
    private float weight;
    private String manufacturer;
    private String model;

    public Vehicle(float height, float width, float weight, String manufacturer, String model) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }

//    public void makeVoice(){
//        System.out.println("Im vehicle");
//    }

    public abstract void makeVoice();
}
