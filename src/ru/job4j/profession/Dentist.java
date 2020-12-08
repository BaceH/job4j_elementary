package ru.job4j.profession;

public class Dentist extends Doctor {
    public boolean isPracticing;

    public boolean isPracticing() {
        return isPracticing;
    }

    @Override
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }
}
