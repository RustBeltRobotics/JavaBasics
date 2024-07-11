package org.rbr.example;

import java.util.List;

import org.rbr.example.basics.ControlFlow;
import org.rbr.example.basics.EnumExample;
import org.rbr.example.basics.Operators;
import org.rbr.example.basics.enums.Planet;
import org.rbr.example.basics.enums.TeamBot;
import org.rbr.example.basics.inheritance.Bike;
import org.rbr.example.basics.inheritance.Car;
import org.rbr.example.basics.inheritance.SportsCar;
import org.rbr.example.basics.inheritance.Vehicle;

public class MainApp {

    /**
     * This is the main entrypoint into the application
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args) {
        // ControlFlow controlFlow = new ControlFlow();
        //Note the use of '+' here is called the String concatenation operator - it used to join strings together
        // System.out.println("ControlFlow instance count = " + controlFlow.getInstanceCount());
        // ControlFlow anotherControlFlow = new ControlFlow();
        // System.out.println("ControlFlow instance count = " + controlFlow.getInstanceCount());
        // System.out.println("ControlFlow.performCalculation = " + anotherControlFlow.performCalculation(3));
        // controlFlow.basicWhileLoop();
        // controlFlow.doWhile();
        // controlFlow.basicForLoop();
        // controlFlow.enhancedForLoop();

        // anotherControlFlow.checkContents("Hi");
        // anotherControlFlow.checkContents("Some long sentence...");
        // anotherControlFlow.checkContents("Robots!");
        // anotherControlFlow.switchCase(1);
        // anotherControlFlow.switchCase(2);
        // anotherControlFlow.switchCase(5);

        // Operators.increment();
        // Operators.decrement();
        // Operators.arithmetic();
        // Operators.compoundAssignment();
        // Operators.numericComparison();
        // Operators.stringComparison();
        // Operators.conditional();
        // Operators.typeComparison();
        // Operators.typeWidening();
        // Operators.typeNarrowing();
        // Operators.floatingPointPrecisionIssues();

        // EnumExample.simpleEnum(TeamBot.ECLIPSE);
        // EnumExample.findLargestPlanet(List.of(Planet.EARTH, Planet.MARS, Planet.SATURN, Planet.MERCURY));

        // Vehicle someKindOfVehicle = new Vehicle("Honda", "Fit", 2015);  //compiler won't allow object creation - class is abstract
        // Vehicle huffy = new Bike("Huffy", "Scout", 2023);
        // /* we can also do this: 
        //     Bike huffy = new Bike("Huffy", "Scout", 2023); 
        // */
        // System.out.printf("Bike initial speed = %f %n", huffy.getCurrentSpeed());
        // huffy.accelerate();
        // huffy.accelerate();
        // System.out.printf("Bike after speeding up = %f %n", huffy.getCurrentSpeed());
        // huffy.honk();
        // huffy.brake();
        // System.out.printf("Bike after slowing down = %f %n", huffy.getCurrentSpeed());

        // Vehicle charger = new SportsCar("Dodge", "Charger", 2022, 18.5);
        // charger.start();  //compiler won't allow this since we declared charger as a Vehicle (not a Car) - Vehicle doesn't have a start method
        // Car chargerCasted = (Car) charger;  //if charger weren't a Car type (eg. we created it as a Truck), this would throw a ClassCastException
        // System.out.printf("Charger initial speed = %f, fuel level = %f, is car running = %b %n", chargerCasted.getCurrentSpeed(), chargerCasted.getCurrentFuelLevel(), chargerCasted.isRunning());
        // charger.accelerate();  //oops - we forgot to start the car
        // chargerCasted.start();
        // charger.accelerate();  //oops - we forgot to add gas
        // chargerCasted.fuelUp(5.0);
        // charger.accelerate();
        // charger.accelerate();
        // System.out.printf("Charger speed after speeding up = %f, fuel level = %f %n", chargerCasted.getCurrentSpeed(), chargerCasted.getCurrentFuelLevel());
        // charger.brake();
        // System.out.printf("Charger speed after braking = %f, fuel level = %f %n", chargerCasted.getCurrentSpeed(), chargerCasted.getCurrentFuelLevel());
        // chargerCasted.stop();
        // System.out.printf("Charger speed after stopping = %f, fuel level = %f, is car running = %b %n", chargerCasted.getCurrentSpeed(), chargerCasted.getCurrentFuelLevel(), chargerCasted.isRunning());

    }

}
