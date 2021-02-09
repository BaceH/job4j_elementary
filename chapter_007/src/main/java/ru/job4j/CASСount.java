package ru.job4j;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.atomic.AtomicReference;

@ThreadSafe
public class CASСount<T> {
    private final AtomicReference<Integer> count = new AtomicReference<>(0);

    public void increment() {
        int ref;
        int temp;
        do {
            ref = count.get();
            temp = ref + 1;
        } while (!count.compareAndSet(ref, temp));
//        throw new UnsupportedOperationException("Count is not impl.");
    }

    public int get() {
        return count.get();
//        throw new UnsupportedOperationException("Count is not impl.");
    }
}