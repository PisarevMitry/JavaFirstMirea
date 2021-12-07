package ru.mirea.pisarevdmitrii.project.entity;

import java.util.Objects;

public class HealthService {
    private Integer healthServiceId;
    private String title;
    private int price;

    @Override
    public String toString() {
        return "HealthService{" +
                "healthServiceId=" + healthServiceId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", medicalSpecialization=" + medicalSpecialization +
                '}';
    }

    private MedicalSpecialization medicalSpecialization;

    public HealthService() {
    }

    public HealthService(String title, int price, MedicalSpecialization medicalSpecialization) {
        this.title = title;
        this.price = price;
        this.medicalSpecialization = medicalSpecialization;
    }

    public long getHealthServiceId() {
        return healthServiceId;
    }

    public void setHealthServiceId(Integer healthServiceId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthService that = (HealthService) o;
        return price == that.price && Objects.equals(title, that.title) && medicalSpecialization == that.medicalSpecialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, medicalSpecialization);
    }
}
