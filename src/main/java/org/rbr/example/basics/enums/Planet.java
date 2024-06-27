package org.rbr.example.basics.enums;

public enum Planet {

    MERCURY(1, 1516),
    VENUS(2, 3761),
    EARTH(3, 3959),
    MARS(4, 2460),
    JUPITER(5, 43441),
    SATURN(6, 36184),
    URANUS(7, 15759),
    NEPTUNE(8, 15299);

    private final int order; //numeric ordering starting from the sun - closest = 1
    private final int radius;  //approximate radius (in miles)

    //constructor
    Planet(int order, int radius) {
        this.order = order;
        this.radius = radius;
    }

    public static Planet fromOrderFromSun(int order) {
        for (Planet day : Planet.values()) {
			if (day.order == order) {
				return day;
			}
		}

        throw new IllegalArgumentException("Invalid value for order: " + order);
    }

    public int getOrder() {
        return order;
    }

    public int getRadius() {
        return radius;
    }

}
