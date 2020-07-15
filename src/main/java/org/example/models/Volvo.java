package org.example.models;

public class Volvo extends Car {

    private double loadCapacity;

    public Volvo(String modelName, double loadCapacity) {
        super("Volvo", modelName);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
