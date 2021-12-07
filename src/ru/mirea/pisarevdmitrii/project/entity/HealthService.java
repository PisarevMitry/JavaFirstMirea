package ru.mirea.pisarevdmitrii.project.entity;

public class HealthService {
    private long healthServiceId;
    private String title;
    private int price;
    private MedicalSpecialization medicalSpecialization;

    public HealthService() {
    }

    public HealthService(long healthServiceId, String title, int price, MedicalSpecialization medicalSpecialization) {
        this.healthServiceId = healthServiceId;
        this.title = title;
        this.price = price;
        this.medicalSpecialization = medicalSpecialization;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MedicalSpecialization getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(MedicalSpecialization medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }
}
