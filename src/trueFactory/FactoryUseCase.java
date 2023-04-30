package trueFactory;

public class FactoryUseCase {
    private Factory factory;

    public FactoryUseCase(Factory factory) {
        this.factory = factory;
    }

    public void addInstruction(InstructionComputerPart instruction) {
        try {
            factory.addInstruction(instruction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ComputerPart getComputerPartByName(String name) {
        try {
            return factory.getComputerPartByName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
