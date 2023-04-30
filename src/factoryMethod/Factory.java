package factoryMethod;

public class Factory {
   public  ComputerPart getComputerPartByName(String name) {
        if (name.contains("video")) {
            return new VideoCard();
        }

        if (name.contains("network")) {
            return new NetworkCard();
        }

        return null;
    }
}
