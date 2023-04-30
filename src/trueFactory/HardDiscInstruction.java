package trueFactory;

public class HardDiscInstruction implements InstructionComputerPart {


    @Override
    public String getComputerPartName() {
        return "HardDisc";
    }


    @Override
    public ComputerPart getNewInstance() {
       return new HardDisc();
    }
}
