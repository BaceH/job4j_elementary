package ru.job4j.pool;

import ru.job4j.queue.SimpleBlockingQueue;

import java.util.LinkedList;
import java.util.List;

public class ThreadPool {
    private final List<Thread> threads = new LinkedList<>();
    private final SimpleBlockingQueue<Runnable> tasks = new SimpleBlockingQueue<>(Runtime.getRuntime().availableProcessors());

    public void work(Runnable job) throws InterruptedException {
        tasks.offer(job);
        threads.stream()
                .filter(t -> t.getState().equals(Thread.State.WAITING))
                .forEach(Object::notify);

    }

    public void shutdown() {
        threads.forEach(Thread::interrupt);
    }
}
