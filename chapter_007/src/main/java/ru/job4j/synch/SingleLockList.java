package ru.job4j.synch;

import net.jcip.annotations.ThreadSafe;

import java.util.Iterator;

@ThreadSafe
public class SingleLockList<T> implements Iterable<T> {
    private final DynamicContainer dynamicList = new DynamicContainer();


    public synchronized void add(T value) {
        dynamicList.add(value);
    }

    public synchronized T get(int index) {
        return (T) dynamicList.get(index);
    }

    @Override
    public synchronized Iterator<T> iterator() {
        return copy(this.dynamicList).iterator();
    }

    private DynamicContainer copy(DynamicContainer dynamicContainer) {
        DynamicContainer dynamicContainerResult = new DynamicContainer();
        for (int i = 0; i < dynamicContainer.getLength() ; i++){
            dynamicContainerResult.add(dynamicContainer.get(i));
        }
        return dynamicContainerResult;
    }
}