package ru.mirea.pisarevdmitrii.project.service.healthService;

import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;

public class getService implements Service {
    private Appointment appointment;

    @Override
    public double getPrice() {
        return appointment.getHealthService().getPrice();
    }

    @Override
    public String getLabel() {
        return appointment.getHealthService().getTitle();
    }

    @Override
    public Doctor getDoctor() {
        return appointment.getDoctor();
    }
}
