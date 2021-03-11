package ru.job4j.multithreads;



public class MasterSlaveBarrier {
    private boolean flag = true;

    private final Object monitor = this;

    public void tryMaster() {
        synchronized (monitor) {
            while (!flag) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            flag = true;
        }
    }


    public void trySlave() {
        synchronized (monitor) {
            while (flag) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            flag = false;
        }
    }

    public void doneMaster() {
        synchronized (monitor) {
            flag = false;
            monitor.notifyAll();
        }
    }

    public void doneSlave() {
        synchronized (monitor) {
            flag = true;
            monitor.notifyAll();
        }
    }

}
