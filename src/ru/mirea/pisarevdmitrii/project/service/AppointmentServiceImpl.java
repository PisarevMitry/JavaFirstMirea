package ru.mirea.pisarevdmitrii.project.service;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Appointment;

import java.util.ArrayList;

public class AppointmentServiceImpl implements AppointmentService {

    public DatabaseTable<Appointment> appointmentRepository;

    public AppointmentServiceImpl(DatabaseTable<Appointment> appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public ArrayList<Appointment> getAllAppointment() {
        return appointmentRepository.getAll();
    }

    @Override
    public Appointment getAppointment(Appointment appointment) {
        return appointmentRepository.get(appointmentRepository.search(appointment));
    }

    @Override
    public Appointment getAppointment(Integer index) {
        return appointmentRepository.get(index);
    }

    @Override
    public void postAppointment(Appointment appointment) {
        appointmentRepository.add(appointment);
        appointment.setAppointmentId(appointmentRepository.getIndex());
    }

    @Override
    public void removeAppointment(Appointment appointment) {
        appointmentRepository.remove(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment, Appointment appointmentNew) {
        appointmentRepository.remove(appointment);
        appointmentRepository.add(appointment);
    }
}
