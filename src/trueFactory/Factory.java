package trueFactory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, InstructionCar> instructions = new HashMap<>();

    public Factory() {
        instructions = new HashMap<>();
    }

    public void addInstruction(InstructionCar instruction) {

        if (instructions.get(instruction.getCarName()) != null) {
            throw new RuntimeException("Instruction already exists");
        }
        instructions.put(instruction.getCarName(), instruction);

    }

    public Car getCarByName(String name) {
        InstructionCar instruction = instructions.get(name);

        if (instruction == null) {
            throw new RuntimeException("Instruction not found");
        }
        return instruction.getNewInstance();

    }

}
