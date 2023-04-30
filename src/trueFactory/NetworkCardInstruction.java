package trueFactory;

public class NetworkCardInstruction implements InstructionComputerPart {

    @Override
    public String getComputerPartName() {
        return "NetworkCard";
    }

    @Override
    public ComputerPart getNewInstance() {
       return new NetworkCard();
    }
}
