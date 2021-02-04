package ru.job4j.queue;

public class Producer<T> implements Runnable {
    private SimpleBlockingQueue<T> simpleBlockingQueue;

    public Producer(SimpleBlockingQueue<T> simpleBlockingQueue) {
        this.simpleBlockingQueue = simpleBlockingQueue;
    }

    @Override
    public void run() {
        Integer i = 10;
        System.out.println("Producer run");
        while(i < 15) {
            simpleBlockingQueue.offer((T) i);
            i++;
        }
    }
}
