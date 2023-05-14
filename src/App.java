import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import GasStation.GasStation;
import trueFactory.Car;
import trueFactory.Factory;
import trueFactory.FactoryUseCase;
import trueFactory.FordInstruction;
import trueFactory.OpelInstruction;
import trueFactory.MazdaInstruction;

public class App {

    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();
        GasStation gasStation = new GasStation();

        FactoryUseCase factoryUseCase = new FactoryUseCase(factory);

        factoryUseCase.addInstruction(new OpelInstruction());
        factoryUseCase.addInstruction(new FordInstruction());
        factoryUseCase.addInstruction(new MazdaInstruction());

        ArrayList<Car> cars = new ArrayList<Car>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            ArrayList<String> colors = new ArrayList<String>();

            colors.add("red");
            colors.add("blue");
            colors.add("green");
            colors.add("yellow");
            colors.add("black");

            int randomCar = random.nextInt(3);
            int randomColorIndex = random.nextInt(colors.size());
            int randomYear = random.nextInt(20) + 2000;

            if (randomCar == 0) {
                cars.add(factoryUseCase.getCarByName("Opel", colors.get(randomColorIndex), randomYear));
            } else if (randomCar == 1) {
                cars.add(factoryUseCase.getCarByName("Ford", colors.get(randomColorIndex), randomYear));
            } else if (randomCar == 2) {
                cars.add(factoryUseCase.getCarByName("Mazda", colors.get(randomColorIndex), randomYear));
            }
        }

        // Gas station normal queue refuelling

        for (Car car : cars) {
            gasStation.addCarToQueue(car);
        }

        System.out.println("");
        System.out.println("Gas station normal queue refuelling");
        System.out.println("");

        while (gasStation.getQueueSize() > 0) {
            Car car = gasStation.getCarFromQueue();
            System.out.println(car.getClass().getSimpleName() + " " +
                    car.getYearOfProduction() + " "
                    + car.getColor() + " " + "got refueled");
        }

        System.out.println("");
        System.out.println("Gas station priority queue refuelling");

        // Gas station priority queue refuelling
        for (Car car : cars) {
            gasStation.addCarToPriorityQueue(car);
        }

        while (gasStation.getPriorityQueueSize() > 0) {
            Car car = gasStation.getCarFromPriorityQueue();
            System.out.println(car.getClass().getSimpleName() + " " +
                    car.getYearOfProduction() + " "
                    + car.getColor() + " " + "got refueled");
        }

        //

        try {
            cars.sort((Car c1, Car c2) -> {
                if (c1.getYearOfProduction() == c2.getYearOfProduction()) {
                    return c1.getColor().compareTo(c2.getColor());
                } else {
                    return c1.getYearOfProduction() - c2.getYearOfProduction();
                }
            });

            System.out.println("");
            System.out.println("Cars sorted by year and then by color");

            for (Car car : cars) {
                System.out.println(
                        car.getClass().getSimpleName() + " " + car.getYearOfProduction() + " " + car.getColor());
            }

            System.out.println("");
            System.out.println("Reversed cars sorted by year and then by color");

            Collections.reverse(cars);

            for (Car car : cars) {
                System.out.println(
                        car.getClass().getSimpleName() + " " + car.getYearOfProduction() + " " + car.getColor());
            }

        } catch (Exception e) {
            System.out.println("No such car instruction in factory");
        }

    }
}
