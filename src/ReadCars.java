import trueFactory.Car;
import java.io.*;
import java.util.ArrayList;

public class ReadCars {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

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

        System.out.println("Saved Cars:");
        for (Car car : cars) {
            System.out.println(car.getDefaultInterface());
        }

        System.out.println();
        System.out.println("Running cars...");
        for (Car car : cars) {
            if (car instanceof trueFactory.Ford)
                ((trueFactory.Ford) car).startSelfDrivingMode();

            if (car instanceof trueFactory.Mazda)
                ((trueFactory.Mazda) car).honkAtPedestrians();

            if (car instanceof trueFactory.Opel)
                ((trueFactory.Opel) car).lockCarDoors();

            System.out.println(car.run());

            if (car instanceof trueFactory.Opel)
                ((trueFactory.Opel) car).unlockCarDoors();

            System.out.println(car.run());
        }
    }
}
