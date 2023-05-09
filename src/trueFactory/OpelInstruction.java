package trueFactory;

public class OpelInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Opel";
    }

    @Override
    public Car getNewInstance() {
        return new Opel();
    }
}
