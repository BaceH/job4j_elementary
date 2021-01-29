package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + rsl);
    }
}