package ru.job4j.profession;

public class Engineer extends Profession {

    public TechnicalTask getDocument(Project project) {
        return project.getTechnicalTask();
    }
}
