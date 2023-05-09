package CarFactory.Car.Engine;

public class Engine extends AbstractEngine {

    private int horsePower;
    private int weight;
    private int value;

    public Engine(int horsePower, int weight, int value) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return value;
    }

}
