package trueFactory;

import java.io.Serializable;

public abstract class Car implements Serializable {
    Boolean isRunning = false;

    public abstract String getDefaultInterface();

    public String run() {
        if (isRunning) {
            return getDefaultInterface() + " is already running ";
        }
        isRunning = true;

        return getDefaultInterface() + " is running ";
    }

    public String stop() {
        if (!isRunning) {
            return getDefaultInterface() + " is already stopped ";
        }

        isRunning = false;

        return getDefaultInterface() + " is stopped ";
    }

}
