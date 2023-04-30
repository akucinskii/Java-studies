package factory;

public class VideoCard extends ComputerPart {

    @Override
    public void doSomething() {
        System.out.println("VideoCard is doing something"); 
    }

    @Override
    public String getDefaultInterface() {
        return "PCI";
    }

    @Override
    public String run(String name) {
        return "VideoCard is running " + name;
    }
    
}
