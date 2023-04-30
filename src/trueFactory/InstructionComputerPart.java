package trueFactory;

public interface InstructionComputerPart {
    public void doSomething();

    public String getDefaultInterface();

    public String getComputerPartName();

    public String run(String name);

    // get new instance
    public ComputerPart getNewInstance();
}
