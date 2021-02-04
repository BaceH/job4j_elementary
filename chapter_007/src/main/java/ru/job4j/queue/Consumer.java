package ru.job4j.queue;

public class Consumer<T> implements Runnable {
    private SimpleBlockingQueue<T> simpleBlockingQueue;

    public Consumer(SimpleBlockingQueue<T> simpleBlockingQueue) {
        this.simpleBlockingQueue = simpleBlockingQueue;
    }

    @Override
    public void run() {
        System.out.println("Consumer run");
        while (true) {
            T i = simpleBlockingQueue.poll();
        }
    }
}
