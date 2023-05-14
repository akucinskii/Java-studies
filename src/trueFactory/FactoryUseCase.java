package trueFactory;

public class FactoryUseCase {
    private Factory factory;

    public FactoryUseCase(Factory factory) {
        this.factory = factory;
    }

    public void addInstruction(InstructionCar instruction) {
        try {
            factory.addInstruction(instruction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Car getCarByName(String name, Object... o) {
        try {
            return factory.getCarByName(name, o);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
