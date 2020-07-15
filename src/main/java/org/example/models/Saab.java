package org.example.models;

public class Saab extends Car {

    private int topSpeed;

    public Saab(String modelName, int topSpeed) {
        super("SAAB", modelName);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
