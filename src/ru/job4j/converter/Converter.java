package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int euro = Converter.rubleToEuro(in);
        boolean passed = expected == euro;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        int dollar = Converter.rubleToDollar(in);
        passed = expected == dollar;
        System.out.println("120 rubles are 2. Test result : " + passed);

    }
}
