package CarFactory.Car;

import CarFactory.Car.Brand.Brand;
import CarFactory.Car.Engine.Engine;

public class Car extends AbstractCar {

    private int value;
    private Brand brand;
    private Engine engine;
    private String name;

    Car(Engine engine, Brand brand) {
        this.engine = engine;
        this.brand = brand;
        this.value = calculateValue(engine, brand);
    }

    public int getValue() {
        return value;
    }

    public Brand getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getName(String name) {
        return name;
    }

    public void drive() {
        System.out.println("You're driving at speed of " + engine.getHorsePower() * 0.5 + " km/h");

    }

    public int calculateValue(Engine engine, Brand brand) {
        return engine.getValue() + brand.getValue();
    }

}
