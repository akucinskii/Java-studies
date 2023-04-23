package Car;

public abstract class Car {

    int horsePower;
    String color;
    String brand;
    Boolean isRunning = false;
    
    abstract void drive();

    abstract void stop();


}
