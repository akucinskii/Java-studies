package trueFactory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, InstructionComputerPart> instructions = new HashMap<>();

    public Factory() {
        instructions = new HashMap<>();
    }


    public void addInstruction(InstructionComputerPart instruction) {
        instructions.put(instruction.getComputerPartName(), instruction);
    }

    public ComputerPart getComputerPartByName(String name) {
        InstructionComputerPart instruction = instructions.get(name);
        if (instruction == null) {
            return null;
        }

        return instruction.getNewInstance();

    }




}
