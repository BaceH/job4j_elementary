package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int res = money - price;
        while (res != 0) {
            for (int coin : coins) {
                if (coin <= res) {
                    res -= coin;
                    rsl[size] = coin;
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
