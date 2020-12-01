package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int l = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[l - i];
            array[l - i] = tmp;
        }
        return array;
    }
}
