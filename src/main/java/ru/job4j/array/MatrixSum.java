package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] rows : array) {
            for (int cell : rows) {
                rsl += cell;
            }
        }
        return rsl;
    }
}
