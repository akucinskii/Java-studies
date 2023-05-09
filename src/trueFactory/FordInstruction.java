package trueFactory;

public class FordInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Ford";
    }

    @Override
    public Car getNewInstance() {
        return new Ford();
    }
}
