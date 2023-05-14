package trueFactory;

public class OpelInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Opel";
    }

    @Override
    public Car getNewInstance(Object... o) {
        if (o.length == 2) {
            return new Opel((String) o[0], (int) o[1]);
        } else {
            return new Opel("white", 2000);
        }

    }
}
