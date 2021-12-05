package ru.mirea.pisarevdmitrii.project.entity;

public class HealthService {
    private long healthServiceId;
    private String title;
    private double price;
    private MedicalSpecialization medicalSpecialization;

    public HealthService() {
    }

    public long getHealthServiceId() {
        return healthServiceId;
    }

    public void setHealthServiceId(long healthServiceId) {
        this.healthServiceId = healthServiceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MedicalSpecialization getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(MedicalSpecialization medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }
}
