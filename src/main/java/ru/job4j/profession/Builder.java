package ru.job4j.profession;

import java.util.Date;

public class Builder extends Engineer {

    public Builder(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public TechnicalTask getDocument(Project project) {
        return super.getDocument(project);
    }
}
