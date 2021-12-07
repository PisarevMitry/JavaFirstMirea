package ru.mirea.pisarevdmitrii.project.controller;


import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.MedicalSpecialization;
import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;
import ru.mirea.pisarevdmitrii.project.service.JPAservice.AppointmentService;

import java.util.ArrayList;
import java.util.Calendar;

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

    public ArrayList<Appointment> getAllAppointmentByTime(DateAndTime dateAndTime) {
        ArrayList<Appointment> appointments = appointmentService.getAllAppointment();
        for (int i = 0; i < appointments.size(); i++) {
            if (!appointments.get(i).getDate().equals(dateAndTime)) {
                appointments.remove(i);
            }
        }
        return appointments;
    }

    public ArrayList<Appointment> getAllAppointmentByDoctor(Doctor doctor) {
        ArrayList<Appointment> appointments = appointmentService.getAllAppointment();
        for (int i = 0; i < appointments.size(); i++) {
            if (!appointments.get(i).getDoctor().equals(doctor)) {
                appointments.remove(i);
            }
        }
        return appointments;
    }

    public ArrayList<Appointment> getAllAppointmentByDoctorTime(Doctor doctor, DateAndTime dateAndTime) {
        ArrayList<Appointment> appointments = appointmentService.getAllAppointment();
        for (int i = 0; i < appointments.size(); i++) {
            if (!appointments.get(i).getDoctor().equals(doctor) || !appointments.get(i).getDate().equals(dateAndTime)) {
                appointments.remove(i);
            }
        }
        return appointments;
    }

    public ArrayList<Doctor> getAllDoctorByEmptyTime(ArrayList<Doctor> doctors, DateAndTime dateAndTime) {
        ArrayList<Appointment> appointments = appointmentService.getAllAppointment();
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getDate() == dateAndTime) {
                doctors.remove(appointments.get(i).getDoctor());
            }
        }
        return doctors;
    }

    public ArrayList<DateAndTime> getAllEmptyTime(MedicalSpecialization medicalSpecialization) {

        ArrayList<DateAndTime> date = new ArrayList<>();
        int startCalendarDay = new DateAndTime().getCalendar().get(Calendar.DAY_OF_MONTH);
        for (int day = 0; day <= 12; day++) {
            for (int hour = 9; hour < 18; hour++)
                for (int minute = 0; minute < 60; minute += 30)
                    date.add(new DateAndTime(startCalendarDay + day, hour, minute));
        }

        ArrayList<Appointment> appointments = appointmentService.getAllAppointment();
        for (Appointment appointment : appointments) {
            date.remove(appointment.getDate());
        }
        return date;
    }

}
