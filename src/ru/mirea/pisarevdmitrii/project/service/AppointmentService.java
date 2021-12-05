package ru.mirea.pisarevdmitrii.project.service;

import ru.mirea.pisarevdmitrii.project.entity.Appointment;

import java.util.ArrayList;

public interface AppointmentService {
    ArrayList<Appointment> getAllAppointment();

    Appointment getAppointment(Appointment doctor);

    Appointment getAppointment(Integer index);

    void postAppointment(Appointment appointment);

    void removeAppointment(Appointment appointment);

    void updateAppointment(Appointment appointment, Appointment appointmentNew);
}
