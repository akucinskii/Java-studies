package trueFactory;

public class HardDisc extends ComputerPart {

    @Override
    public void doSomething() {
        System.out.println("Hard disc is doing something");
    }

    @Override
    public String getDefaultInterface() {
       return "SATA";
    }

    @Override
    public String run(String name) {
        return "Hard disc is running " + name + " on " + getDefaultInterface();
    }
}
