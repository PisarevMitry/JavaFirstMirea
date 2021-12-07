package ru.mirea.pisarevdmitrii.project.entity;

import org.jetbrains.annotations.NotNull;
import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayStrategy;

import java.util.Objects;

public class Appointment {
    private long appointmentId;
    private DateAndTime date;
    private Doctor doctor;
    private HealthService healthService;
    private String cabinet;
    private Patient patient;
    private boolean visited;

    private boolean payment;

    public Appointment() {
    }

    public Appointment(DateAndTime date, Doctor doctor, HealthService healthService, String cabinet, Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.healthService = healthService;
        this.cabinet = cabinet;
        this.patient = patient;
        this.visited = false;
        this.payment = false;
    }

    public void processOrder(@NotNull PayStrategy strategy) {
        strategy.collectPaymentDetails();
        payment = strategy.pay(healthService.getPrice());
        // Здесь мы могли бы забрать и сохранить платежные данные из стратегии.
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

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return date.equals(that.date) && doctor.equals(that.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, doctor);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", date=" + date +
                ", doctor=" + doctor +
                ", healthService=" + healthService +
                ", cabinet='" + cabinet + '\'' +
                ", patient=" + patient +
                ", visited=" + visited +
                ", payment=" + payment +
                '}';
    }
}
