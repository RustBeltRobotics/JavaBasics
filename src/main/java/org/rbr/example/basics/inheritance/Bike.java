package org.rbr.example.basics.inheritance;

public class Bike extends Vehicle {

    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed--;
        }
    }

    @Override
    public void accelerate() {
        if (currentSpeed < getMaxSpeed()) {
            currentSpeed++;
        }
    }

    @Override
    public double getMaxSpeed() {
        return 25.0;
    }

    @Override
    public void honk() {
        //Bike's use bells
        System.out.println("*Ring* *Ring*");
    }

}
