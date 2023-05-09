package CarFactory.Car.Brand;

public class Brand extends AbstractBrand {

    private String name;
    private int value;

    public Brand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
