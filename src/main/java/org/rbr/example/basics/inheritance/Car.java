package org.rbr.example.basics.inheritance;

public class Car extends Vehicle {

    //fuel levels measured in gallons
    protected final double maxFuelLevel;
    protected double speedFactor; 
    protected double fuelConsumption;
    protected double currentFuelLevel;
    protected boolean running;

    public Car(String make, String model, int year, double maxFuelLevel) {
        super(make, model, year);
        this.maxFuelLevel = maxFuelLevel;
        this.running = false;
        speedFactor = 2.5;
        fuelConsumption = 0.01;
    }

    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed -= 2.5;
        }
    }

    @Override
    public void accelerate() {
        if (!running) {
            System.out.println("You havent started the car yet!");
            return;
        }

        currentFuelLevel -= fuelConsumption;  //consume a little fuel

        if (currentSpeed < getMaxSpeed() && currentFuelLevel > maxFuelLevel * fuelConsumption) {
            currentSpeed += speedFactor;
        }

        if (currentFuelLevel <= (maxFuelLevel * fuelConsumption)) {
            System.out.println("Warning! Fuel tank empty!");
        } else if (currentFuelLevel <= (maxFuelLevel * 0.1)) {
            System.out.println("Warning! Low fuel level detected!");
        }
    }

    @Override
    public double getMaxSpeed() {
        //we could get fancy and use a formula including car's current weight, engine type, etc. to calculate this if we wanted to
        return 100.0;
    }

    @Override
    public void honk() {
        System.out.println("*Beep* *Beep*");
    }

    public void fuelUp(double addedFuel) {
        double calculatedNewFuelLevel = currentFuelLevel + addedFuel;
        if (calculatedNewFuelLevel > maxFuelLevel) {
            throw new RuntimeException("Fuel overflow!!!");
        }

        currentFuelLevel = calculatedNewFuelLevel;
    }

    public void start() {
        System.out.println("Starting up!");
        this.running = true;
    }

    public void stop() {
        while (currentSpeed > 0) {
            brake();
        }
        this.running = false;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public double getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

}
