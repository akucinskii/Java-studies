package trueFactory;

public class VideoCard extends ComputerPart {

    @Override
    public void doSomething() {
        System.out.println("VideoCard is doing something");
    }

    @Override
    public String getDefaultInterface() {
        return "EEE";
    }

    @Override
    public String run(String name) {
        return "Video Card is running " + name;
    }
}
