package ru.job4j.profession;

import java.util.Date;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, Date birthday) {
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

    public TechnicalTask getDocument(Project project) {
        return project.getTechnicalTask();
    }
}
