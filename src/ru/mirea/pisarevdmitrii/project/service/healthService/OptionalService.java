package ru.mirea.pisarevdmitrii.project.service.healthService;

import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;

public class OptionalService implements Service {
    private Service service;
    private Appointment appointment;

    public OptionalService(Service service, Appointment appointment) {
        this.service = service;
        this.appointment = appointment;
    }

    @Override
    public double getPrice() {
        return (service.getPrice() + appointment.getHealthService().getPrice());
    }

    @Override
    public String getLabel() {
        return (service.getLabel() + appointment.getHealthService().getTitle());
    }

    @Override
    public Doctor getDoctor() {
        return appointment.getDoctor();
    }
}
