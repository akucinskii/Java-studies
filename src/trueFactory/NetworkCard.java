package trueFactory;

public class NetworkCard extends ComputerPart {

    @Override
    public void doSomething() {
        System.out.println("NetworkCard is doing something");
    }

    @Override
    public String getDefaultInterface() {
       return "PCI";
    }

    @Override
    public String run(String name) {
        return "NetworkCard is running " + name + " " + getDefaultInterface();
    }
    
    
}
