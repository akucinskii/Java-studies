package Car;

public class CarFactory {
    
    public static Car createCar(String type) {
        if (type.equals("Opel")) {
            return new Opel();
        } else if (type.equals("Ford")) {
            return new Ford();
        } else {
            return null;
        }
    }
}
