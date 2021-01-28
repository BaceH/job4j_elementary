package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 550);
        Book cleanArchitecture = new Book("Clean Architecture", 449);
        Book cleanAgile = new Book("Clean Agile", 750);
        Book continuousDelivery = new Book("Continuous delivery", 555);
        Book[] library = new Book[4];
        library[0] = cleanCode;
        library[1] = cleanArchitecture;
        library[2] = cleanAgile;
        library[3] = continuousDelivery;

        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName() + " - " + library[index].getCountPage());
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (Book book : library) {
            System.out.println(book.getName() + " - " + book.getCountPage());
        }

        for (Book book : library) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCountPage());
            }
        }
    }
}
