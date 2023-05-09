package CarFactory;

import CarFactory.Car.Car;
import CarFactory.Car.InstructionCar;

public class FactoryErrorAdapter {
    private Factory factory;

    public FactoryErrorAdapter(Factory factory) {
        this.factory = factory;
    }

    public void addInstruction(InstructionCar instruction) {
        try {
            factory.addInstruction(instruction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Car getComputerPartByName(String name) {
        try {
            return factory.getComputerPartByName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
