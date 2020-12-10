package ru.job4j.profession;

import java.util.Date;

public class Doctor extends Profession {
    private int experience;

    public Doctor(String name, String surname, String education, Date birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
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

    public Diagnosis heal(Pacient pacient) {
       return pacient.getDiagnosis();
    }
}
