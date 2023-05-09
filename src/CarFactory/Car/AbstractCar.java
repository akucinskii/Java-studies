package CarFactory.Car;

import CarFactory.Car.Brand.Brand;
import CarFactory.Car.Engine.Engine;

public abstract class AbstractCar {
    public abstract int getValue();

    public abstract int calculateValue(Engine engine, Brand brand);

    public abstract void drive();
}
