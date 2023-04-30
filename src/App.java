import trueFactory.ComputerPart;
import trueFactory.Factory;
import trueFactory.NetworkCardInstruction;


public class App {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();

        factory.addInstruction(new NetworkCardInstruction());

        ComputerPart computerPart = factory.getComputerPartByName("NetworkCard");

      
        System.out.println(computerPart.run("hello"));


    }
}
