package Car;

import java.io.Serializable;

public class Ford extends Car implements Serializable {

    public Ford() {
        this.brand = "Ford";
        this.color = "Red";
        this.horsePower = 200;
    }

    @Override
    public void drive() {
        this.isRunning = true;
        System.out.println("Driving a Ford");

    }

    @Override
    public void stop() {
        this.isRunning = false;
        System.out.println("Stopping a Ford");
    }
    
}
