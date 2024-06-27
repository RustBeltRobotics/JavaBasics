package org.rbr.example;

import java.util.List;

import org.rbr.example.basics.ControlFlow;
import org.rbr.example.basics.EnumExample;
import org.rbr.example.basics.Operators;
import org.rbr.example.basics.enums.Planet;
import org.rbr.example.basics.enums.TeamBot;

public class MainApp {

    /**
     * This is the main entrypoint into the application
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();
        //Note the use of '+' here is called the String concatenation operator - it used to join strings together
        System.out.println("ControlFlow instance count = " + controlFlow.getInstanceCount());
        ControlFlow anotherControlFlow = new ControlFlow();
        System.out.println("ControlFlow instance count = " + controlFlow.getInstanceCount());
        System.out.println("ControlFlow.performCalculation = " + anotherControlFlow.performCalculation(3));
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
    }

}
