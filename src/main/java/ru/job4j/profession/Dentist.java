package ru.job4j.profession;

import java.util.Date;

public class Dentist extends Doctor {
    private boolean isPracticing;

    public Dentist(String name, String surname, String education, Date birthday, int experience, boolean isPracticing) {
        super(name, surname, education, birthday, experience);
        this.isPracticing = isPracticing;
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

    public boolean isPracticing() {
        return isPracticing;
    }

    @Override
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }
}
