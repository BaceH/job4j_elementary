package ru.job4j.profession;

import java.util.Date;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public TechnicalTask getDocument(Project project) {
        return super.getDocument(project);
    }
}
