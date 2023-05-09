package CarFactory;

public class VideoCardInstruction implements InstructionComputerPart {

    @Override
    public String getComputerPartName() {
        return "VideoCard";
    }

    @Override
    public ComputerPart getNewInstance() {
        return new VideoCard();
    }
}
