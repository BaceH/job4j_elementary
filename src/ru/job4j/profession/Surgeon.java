package ru.job4j.profession;

public class Surgeon extends Doctor {
    public int numberDeaths;

    public int getNumberDeaths() {
        return numberDeaths;
    }

    @Override
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }
}
