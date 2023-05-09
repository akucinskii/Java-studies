package trueFactory;

public class Ford extends Car {

    public String getDefaultInterface() {
        return "Ford";
    }

    // generate some function unique to ford

    public void startSelfDrivingMode() {
        System.out.println("Ford is starting self driving mode");
    }
}
