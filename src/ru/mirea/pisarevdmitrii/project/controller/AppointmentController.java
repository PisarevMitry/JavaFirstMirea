package ru.mirea.pisarevdmitrii.project.controller;


import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.pisarevdmitrii.project.service.AppointmentService;

import java.util.ArrayList;

public class AppointmentController {
    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    public ArrayList<Appointment> getAllAppointment() {
        return appointmentService.getAllAppointment();
    }

    public Appointment getAppointment(Appointment appointment) {
        return appointmentService.getAppointment(appointment);
    }

    public Appointment getAppointment(Integer index) {
        return appointmentService.getAppointment(index);
    }

    public void postAppointment(Appointment appointment) {
        appointmentService.postAppointment(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointmentService.removeAppointment(appointment);
    }

    public void updateAppointment(Appointment appointment, Appointment appointmentNew) {
        appointmentService.updateAppointment(appointment, appointmentNew);
    }
}
