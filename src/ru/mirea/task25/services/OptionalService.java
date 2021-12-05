package ru.mirea.task25.services;

import ru.mirea.task16.Doctor;

public class OptionalService implements Service {
    private Service service;
    private String label;
    private double price;

    public OptionalService(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String getLabel() {
        return this.label + service.getLabel();
    }

    @Override
    public Doctor getDoctor() {
        return null;
    }
}
