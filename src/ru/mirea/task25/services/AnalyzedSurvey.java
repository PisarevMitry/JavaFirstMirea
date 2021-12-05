package ru.mirea.task25.services;

import ru.mirea.task16.Doctor;

public class AnalyzedSurvey implements Service {
    private String label;
    private double price;
    private Doctor doctor;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public Doctor getDoctor() {
        return null;
    }
}
