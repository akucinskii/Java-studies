package trueFactory;

public class Opel extends Car {

    Boolean isLocked = false;

    public Opel(String color, int yearOfProduction) {
        super(color, yearOfProduction);
    }

    public String getDefaultInterface() {
        return "Opel";
    }

    public String lockCarDoors() {
        if (isLocked) {
            return getDefaultInterface() + " is already locked ";
        }

        isLocked = true;

        return getDefaultInterface() + " is locked ";
    }

    public void unlockCarDoors() {
        if (!isLocked) {
            System.out.println(getDefaultInterface() + " is already unlocked ");
        }

        isLocked = false;

        System.out.println(getDefaultInterface() + " is unlocked ");
    }

    @Override
    public String run() {
        if (isLocked) {
            return getDefaultInterface() + " is locked, cannot run ";
        }

        return super.run();
    }

}