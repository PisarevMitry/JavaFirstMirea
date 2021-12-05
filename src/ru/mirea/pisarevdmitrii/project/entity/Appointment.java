package ru.mirea.pisarevdmitrii.project.entity;

import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;

public class Appointment {
    private long appointmentId;
    private DateAndTime date;
    private Doctor doctor;
    private HealthService healthService;
    private String cabinet;
    private Patient patient;
    private boolean visited;

    public Appointment() {
    }

    public long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public DateAndTime getDate() {
        return date;
    }

    public void setDate(DateAndTime date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public HealthService getHealthService() {
        return healthService;
    }

    public void setHealthService(HealthService healthService) {
        this.healthService = healthService;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
