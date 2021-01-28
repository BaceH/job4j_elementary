package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Vasyl Byalyk");
        student.setGroup(52);
        student.setReceipt(new Date());

        System.out.println("Student: " + student.getFio()
                + " group - " + student.getGroup()
                + " date of receipt - " + student.getReceipt());
    }
}
