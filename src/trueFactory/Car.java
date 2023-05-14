package trueFactory;

import java.io.Serializable;

public abstract class Car implements Serializable, Comparable<Car> {
    private Boolean isRunning = false;
    private String color = "white";
    private int yearOfProduction = 2015;

    public Car(String color, int yearOfProduction) {
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract String getDefaultInterface();

    public String run() {
        if (isRunning) {
            return getDefaultInterface() + " is already running ";
        }
        isRunning = true;

        return getDefaultInterface() + " is running ";
    }

    public String stop() {
        if (!isRunning) {
            return getDefaultInterface() + " is already stopped ";
        }

        isRunning = false;

        return getDefaultInterface() + " is stopped ";
    }

    @Override
    public int compareTo(Car o) {
        if (this.getYearOfProduction() == o.getYearOfProduction()) {
            return this.getColor().compareTo(o.getColor());
        } else {
            return this.getYearOfProduction() - o.getYearOfProduction();
        }
    }
}
