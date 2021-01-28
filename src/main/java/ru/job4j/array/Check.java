package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean indicator = data[0];
        for (boolean b : data) {
            if (indicator != b) {
                return false;
            }
        }
        return true;
    }
}
