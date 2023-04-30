package trueFactory;

public class NetworkCardInstruction implements InstructionComputerPart {

    @Override
    public void doSomething() {
        System.out.println("NetworkCard is doing something");
    }

    @Override
    public String getDefaultInterface() {
         return "PCI";
    }

    @Override
    public String getComputerPartName() {
        return "NetworkCard";
    }

    @Override
    public String run(String name) {
        return "NetworkCard is running " + name;
    }

    @Override
    public ComputerPart getNewInstance() {
       return new NetworkCard();
    }
}
