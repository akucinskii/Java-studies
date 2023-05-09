import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Deserialize.DeserializeCars;
import Serialize.Serialize;
import trueFactory.Car;
import trueFactory.Factory;
import trueFactory.FactoryUseCase;
import trueFactory.FordInstruction;
import trueFactory.MazdaInstruction;
import trueFactory.OpelInstruction;

public class SaveCars {

    public static void main(String[] args) {

        Factory factory = new Factory();
        ArrayList<Car> cars = new ArrayList<Car>();
        FactoryUseCase factoryUseCase = new FactoryUseCase(factory);

        // Read cars from file

        DeserializeCars deserializer = new DeserializeCars();
        cars = deserializer.read();

        // Add cars only if there are no cars inside serializable file
        if (cars.isEmpty()) {
            // create some cars

            System.out.println("Creating cars...");
            factoryUseCase.addInstruction(new OpelInstruction());
            factoryUseCase.addInstruction(new FordInstruction());
            factoryUseCase.addInstruction(new MazdaInstruction());

            Car OpelCar = factoryUseCase.getCarByName("Opel");

            Car FordCar = factoryUseCase.getCarByName("Ford");

            Car MazdaCar = factoryUseCase.getCarByName("Mazda");

            // add cars to list
            cars.add(OpelCar);
            cars.add(FordCar);
            cars.add(MazdaCar);

            // Save cars to file
            Serialize.save(cars, "cars.ser");
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Do you want to save? (yes/no) ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("yes")) {
                Serialize.save(cars, "cars.ser");
            } else {
                System.out.println("Cars not saved.");
            }

            scanner.close();
        }
    }
}
