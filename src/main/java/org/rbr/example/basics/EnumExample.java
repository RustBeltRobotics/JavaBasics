package org.rbr.example.basics;

import java.util.List;

import org.rbr.example.basics.enums.Planet;
import org.rbr.example.basics.enums.TeamBot;

public class EnumExample {

    public static void simpleEnum(TeamBot robot) {
        switch (robot) {
            case ARNO:
                System.out.println("You provided - Arno");
                break;
            case DEPARTURE:
                System.out.println("You provided - Departure");
                break;
            default:
                System.out.println("You provided - " + robot.name() + " - Hooray!");
                break;
        }
    }

    public static void findLargestPlanet(List<Planet> planets) {
        if (planets == null || planets.isEmpty()) {
            System.out.println("There were no planets provided!");
            
            return;
        }

        int largestRadius = -1;
        Planet largestPlanet = null;
        for (Planet planet : planets) {
            if (planet.getRadius() > largestRadius) {
                largestRadius = planet.getRadius();
                largestPlanet = planet;
            }
        }

        System.out.printf("The largest planet is %s with a radius of %d miles", largestPlanet, largestPlanet.getRadius());
    }
}
