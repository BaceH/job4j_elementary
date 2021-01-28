package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] price = new float[40];
        System.out.println(price.length);

        String[] names = new String[4];
        names[0] = "Sergey Mayer";
        names[1] = "Rail Shamsemuhametov";
        names[2] = "Korobeinikov Stas";
        names[3] = "Andrei Hincu";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
