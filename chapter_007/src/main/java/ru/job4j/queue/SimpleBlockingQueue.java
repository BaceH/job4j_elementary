package ru.job4j.queue;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<T> {


    @GuardedBy("this")
    private Queue<T> queue = new LinkedList<>();

    private final Object monitor = this;
    private boolean flag = false;

    private int count = 1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getQueueSize() {
        return queue.size();
    }

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
        flag = true;
        notifyAll();

    }


    public synchronized T poll() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }
        T res = queue.remove();
        System.out.println("poll: " + res);
        flag = false;
        notifyAll();
        return res;
    }
}
