package ru.job4j.queue;

import org.junit.Test;

public class SimpleBlockingQueueTest {

    @Test
    public void add() throws InterruptedException {
        SimpleBlockingQueue<Integer> simpleBlockingQueue = new SimpleBlockingQueue<>();

        Thread  producer = new Thread(new Producer<>(simpleBlockingQueue));
        Thread  consumer = new Thread(new Consumer<>(simpleBlockingQueue));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }

}
