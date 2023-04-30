import trueFactory.ComputerPart;
import trueFactory.Factory;
import trueFactory.FactoryUseCase;
import trueFactory.HardDiscInstruction;
import trueFactory.NetworkCardInstruction;
import trueFactory.VideoCardInstruction;

public class App {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();

        FactoryUseCase factoryUseCase = new FactoryUseCase(factory);

        factoryUseCase.addInstruction(new NetworkCardInstruction());
        factoryUseCase.addInstruction(new HardDiscInstruction());
        factoryUseCase.addInstruction(new VideoCardInstruction());

        ComputerPart computerPart = factoryUseCase.getComputerPartByName("NetworkCard");

        ComputerPart hardDiscComputerPart = factoryUseCase.getComputerPartByName("HardDisc");

        ComputerPart videoCardComputerPart = factoryUseCase.getComputerPartByName("VideoCard");

        try {
            System.out.println(computerPart.run("hello"));
            System.out.println(hardDiscComputerPart.run("hello"));
            System.out.println(videoCardComputerPart.run("hello"));
        } catch (Exception e) {
            System.out.println("No such computer part");
        }

    }
}
