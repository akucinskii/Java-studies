package trueFactory;

public class MazdaInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Mazda";
    }

    @Override
    public Car getNewInstance() {
        return new Mazda();
    }
}
