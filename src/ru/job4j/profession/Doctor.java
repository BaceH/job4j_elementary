package ru.job4j.profession;

public class Doctor extends Profession {
    public int experience;

    public int getExperience() {
        return experience;
    }

    public Diagnosis heal(Pacient pacient) {
       return pacient.getDiagnosis();
    }
}
