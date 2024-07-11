package org.rbr.example.basics.inheritance;

public abstract class Vehicle {

    protected final String make;
    protected final String model;
    protected final int year;
    protected double currentSpeed;
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void brake();

    public abstract void accelerate();

    /**
     * Get the maximum speed the vehicle can achieve
     * 
     * @return speed - measured in MPH
     */
    public abstract double getMaxSpeed();

    /**
     * Make a sound to notify others of the vehicle's oncoming presence
     */
    public abstract void honk();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

}
