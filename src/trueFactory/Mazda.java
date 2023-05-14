package trueFactory;

public class Mazda extends Car {

    public Mazda(String color, int yearOfProduction) {
        super(color, yearOfProduction);
    }

    public String getDefaultInterface() {
        return "Mazda";
    }

    public void honkAtPedestrians() {
        System.out.println("Mazda is honking at pedestrians. Honk Honk");
    }

}
