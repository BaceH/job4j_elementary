package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(2, 2));
    }
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
