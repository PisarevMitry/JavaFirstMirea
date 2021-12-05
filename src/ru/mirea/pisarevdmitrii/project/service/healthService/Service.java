package ru.mirea.pisarevdmitrii.project.service.healthService;

import ru.mirea.pisarevdmitrii.project.entity.Doctor;

public interface Service {
    public double getPrice();

    public String getLabel();

    public Doctor getDoctor();
}
