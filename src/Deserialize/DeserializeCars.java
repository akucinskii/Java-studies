package Deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import trueFactory.Car;

public class DeserializeCars {
    public ArrayList<Car> read() {

        ArrayList<Car> cars = null;
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
            throw new RuntimeException("IOException");
        } catch (ClassNotFoundException c) {
            System.out.println("Cars class not found");
            c.printStackTrace();
            throw new RuntimeException("Cars class not found");
        }

        return cars;
    }
}
