package org.example.oop.abstraction;

public class Plane extends Vehicle{
    public Plane(float height, float width, float weight, String manufacturer, String model) {
        super(height, width, weight, manufacturer, model);
    }

    @Override
    public void makeVoice() {
        System.out.println("wziuuuuu im a plane");
    }
}
