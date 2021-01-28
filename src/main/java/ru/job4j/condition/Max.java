package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(2, 2));
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int front) {
        return max(max(left, right), front);
    }

    public static int max(int left, int right, int front, int back) {
        return max(max(left, right), max(front, back));
    }
}
