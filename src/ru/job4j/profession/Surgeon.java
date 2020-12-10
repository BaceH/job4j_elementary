package ru.job4j.profession;

import java.util.Date;

public class Surgeon extends Doctor {
    private int numberDeaths;

    public Surgeon(String name, String surname, String education, Date birthday, int experience, int numberDeaths) {
        super(name, surname, education, birthday, experience);
        this.numberDeaths = numberDeaths;
    }

    public int getNumberDeaths() {
        return numberDeaths;
    }

    @Override
    public int getExperience() {
        return super.getExperience();
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
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }
}
