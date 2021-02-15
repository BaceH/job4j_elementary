package ru.job4j.pool;

import ru.job4j.queue.SimpleBlockingQueue;

class ThreadTask implements Runnable  {
    private SimpleBlockingQueue<Runnable> tasks = null;
    public ThreadTask(SimpleBlockingQueue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        try {
            Runnable r = tasks.poll();
            r.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
