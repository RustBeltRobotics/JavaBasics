package org.rbr.example.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ControlFlow {

    private static final double SOME_CONSTANT = 10.0; //a constant (non-changeable value)
    private static int instanceCount = 0;

    //this is a constructor - use to initialize state of your object
    public ControlFlow() {
        instanceCount++;
    }

    public void basicWhileLoop() {
        int counter = 0;
        //how many times will this loop body be run?
        while (counter < 5) {
            System.out.printf("counter = %d %n", counter);
            counter += 2;  //equivalent to: counter = counter + 2;
        }

        //how many times will this loop body be run?
        while (counter < 4) {
            System.out.println("counter was < 4");
            counter += 1;
        }
    }

    public void doWhile() {
        boolean conditionWasMet = false;
        int counter = 3;

        do {
            System.out.println("doWhile loop body run - counter = " + (--counter));
            if (counter > 3) {
                conditionWasMet = true;
            }
            
        } while (conditionWasMet);  //equivalent to saying conditionWasMet == true
    }

    public void badWhile() {
        int count = 0;
        while (count >= 0) {
            System.out.println("Looping");
            count++;
        }
    }

    public void basicForLoop() {
        int[] integers = new int[3];
        integers[0] = 5;
        integers[1] = 10;
        integers[2] = 15;

        for (int i = 0; i < integers.length; i++) {
            System.out.printf("array index = %d, value = %d %n", i, integers[i]);
        }

        List<String> botNames = List.of("Arno", "Eclipse", "Possum", "2025 Mystery Bot");
        int loopCompletions = 0;
        for (int i = 0; i < botNames.size(); i++) {
            String botName = botNames.get(i);
            if (botName.startsWith("A")) {
                continue;
            }
            if (botName.equals("Possum")) {
                break;
            }
            loopCompletions++;
        }

        System.out.println("The loop completed - " + loopCompletions + " times");

        //what happens if we try to access beyond the size we allocated?
        // integers[3] = 20;
    }

    public void enhancedForLoop() {
        List<String> strings = new ArrayList<>();
        strings.add("Foo");
        strings.add("Bar");
        strings.add("Baz");

        System.out.println("Basic list values:");
        for (String textValue : strings) {
            System.out.println(textValue);
        }

        Collections.sort(strings);
        System.out.println("Sorted values:");
        //functional style equivalent to above enhanced for loop
        strings.forEach(s -> System.out.println(s));  //we use a lambda function here as shorthand
    }

    public void checkContents(String text) {
        if (text.length() <= 4) {
            System.out.println("Too short!");
        } else if (text.length() >= 5 && text.length() < 8) {
            System.out.println("Just right!");
        } else {
            System.out.println("Too long!");
        }
    }

    public void switchCase(int input) {
        var multiplier = 5;

        switch(input) {
            case 1:
                System.out.println(input);
                break;
            case 2:
            case 3:
                System.out.println(input * multiplier);
                break;
            default:
                System.out.println("RBR".concat("*".indent(input)));
        }
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public double performCalculation(int value) {
        return (instanceCount + value) * SOME_CONSTANT;
    }
}
