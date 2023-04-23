import java.io.*;
import java.util.ArrayList;
import Car.Car;
import Car.CarFactory;
import Car.Ford;
import Car.Opel;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();

        // Read cars from file
        try {
            FileInputStream fileIn = new FileInputStream("cars.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cars = (ArrayList<Car>) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // This is the first time the program is run, so there is no cars.ser file yet.
            // We can simply create a new ArrayList for cars.
            cars = new ArrayList<Car>();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Cars class not found");
            c.printStackTrace();
            return;
        }

        // Add cars only if there are no cars inside serializable file
        if (cars.isEmpty()) {
            // create some cars

            System.out.println("Creating cars...");
            Car car1 = CarFactory.createCar("Ford");
            Car car2 = CarFactory.createCar("Opel");

            // add cars to list
            cars.add(car1);
            cars.add(car2);


            // Save cars to file
            try {
                FileOutputStream fileOut = new FileOutputStream("cars.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(cars);
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in cars.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        } else {
            // print saved cars
            System.out.println("Saved Cars:");
            for (Car car : cars) {
                if (car instanceof Ford) {
                    Ford ford = (Ford) car;
                    ford.drive();
                    ford.stop();
                } else if (car instanceof Opel) {
                    Opel opel = (Opel) car;
                    opel.drive();
                    opel.stop();
                }
            }
        }
    }
}