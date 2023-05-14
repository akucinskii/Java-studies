package GasStation;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import trueFactory.Car;

public class GasStation {

    private PriorityQueue<Car> priorityQueue;
    private Queue<Car> queue;

    public GasStation() {
        this.priorityQueue = new PriorityQueue<Car>();
        this.queue = new LinkedList<Car>();

    }

    public void addCarToQueue(Car car) {

        this.queue.add(car);
    }

    public void addCarToPriorityQueue(Car car) {
        this.priorityQueue.add(car);
    }

    public int getPriorityQueueSize() {
        return this.priorityQueue.size();
    }

    public int getQueueSize() {
        return this.queue.size();
    }

    public Car getCarFromPriorityQueue() {
        return (Car) this.priorityQueue.poll();

    }

    public Car getCarFromQueue() {
        return (Car) this.queue.poll();
    }

}
