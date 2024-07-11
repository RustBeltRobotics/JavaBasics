package org.rbr.example.basics.inheritance;

public class SportsCar extends Car {

    public SportsCar(String make, String model, int year, double maxFuelLevel) {
        super(make, model, year, maxFuelLevel);

        //we're faster, but also consume more fuel quicker
        speedFactor = 5.0;
        fuelConsumption = 0.025;
    }

}
