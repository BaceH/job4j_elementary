package ru.job4j;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelSearch<T> extends RecursiveTask<Integer> {

    private final ArrayList<T> array;
    private final int from;
    private final int to;
    private final T element;

    public ParallelSearch(ArrayList<T> array, int from, int to, T element) {
        this.array = array;
        this.from = from;
        this.to = to;
        this.element = element;
    }

    @Override
    protected Integer compute() {
        if ((to - from) < 5) {
            for (int index = 0; index < array.size(); index++) {
                if (array.get(index).equals(element))
                    return index;
            }
            return -1;
        }
        int mid = (from + to) / 2;
        ParallelSearch<T> leftSort = new ParallelSearch<>(array, from, mid, element);
        ParallelSearch<T> rightSort = new ParallelSearch<>(array, mid + 1, to, element);

        leftSort.fork();
        rightSort.fork();

        int left = leftSort.join();
        int right = rightSort.join();
        return Math.max(left, right);
    }

    public int search() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        return  forkJoinPool.invoke(new ParallelSearch<>(array, 0, array.size() - 1, element));
    }
}

