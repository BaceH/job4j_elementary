package ru.job4j.queue;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<T> {


    @GuardedBy("this")
    private Queue<T> queue = new LinkedList<>();

    private int count = 1;

    public synchronized void offer(T value) {
        while (queue.size() == count) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        queue.add(value);
        System.out.println("offer: " + value);
        notifyAll();

    }


    public synchronized T poll() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }
        T res = queue.remove();
        System.out.println("poll: " + res);
        notifyAll();
        return res;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
