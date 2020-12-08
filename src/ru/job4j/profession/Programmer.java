package ru.job4j.profession;

public class Programmer extends Engineer {
    @Override
    public TechnicalTask getDocument(Project project) {
        return super.getDocument(project);
    }
}
