package trueFactory;

public class MazdaInstruction implements InstructionCar {

    @Override
    public String getCarName() {
        return "Mazda";
    }

    @Override
    public Car getNewInstance(Object... o) {
        if (o.length == 2) {
            return new Mazda((String) o[0], (int) o[1]);
        } else {
            return new Mazda("white", 2000);
        }
    }
}
