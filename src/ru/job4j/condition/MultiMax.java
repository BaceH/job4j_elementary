package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second || first < third) {
            if (second > third) {
                result = second;
            } else {
                result = third;
            }
        }

        return result;
    }
}
