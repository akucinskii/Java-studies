package trueFactory;

public class FordInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Ford";
    }

    @Override
    public Car getNewInstance(Object... o) {
        if (o.length == 2) {
            return new Ford((String) o[0], (int) o[1]);
        } else {
            return new Ford("white", 2000);
        }
    }
}
