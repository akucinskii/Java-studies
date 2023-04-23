package Car;

import java.io.Serializable;

public class Opel extends Car implements Serializable{

    public Opel() {
        this.brand = "Opel";
        this.color = "Blue";
        this.horsePower = 150;
    }

    @Override
    public void drive() {
        this.isRunning = true;
        System.out.println("Driving an Opel");
    }

    @Override
    public void stop() {
        this.isRunning = false;
        System.out.println("Stopping an Opel");
    }
    
}
