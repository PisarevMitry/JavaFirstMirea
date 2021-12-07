package ru.mirea.pisarevdmitrii.project.entity;

import java.util.Objects;

public class Doctor {

    private Integer doctorId;
    private String surname;
    private String name;
    private String patronymic;
    private String password;
    private MedicalSpecialization medicalSpecialization;
    private MedicalQualificationCategory medicalQualificationCategory;

    public Doctor() {
    }

    public Doctor(String surname, String name, String password) {
        this.surname = surname;
        this.name = name;
        this.password = password;
    }

    public Doctor(String surname, String name, String patronymic, String password) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.password = password;
    }

    public Doctor(String surname, String name, String patronymic, String password, MedicalSpecialization medicalSpecialization) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.password = password;
        this.medicalSpecialization = medicalSpecialization;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MedicalSpecialization getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(MedicalSpecialization medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }

    public MedicalQualificationCategory getMedicalQualificationCategory() {
        return medicalQualificationCategory;
    }

    public void setMedicalQualificationCategory(MedicalQualificationCategory medicalQualificationCategory) {
        this.medicalQualificationCategory = medicalQualificationCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return surname.equals(doctor.surname) && name.equals(doctor.name) && Objects.equals(patronymic, doctor.patronymic) && medicalSpecialization == doctor.medicalSpecialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, medicalSpecialization);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", medicalSpecialization=" + medicalSpecialization +
                '}';
    }
}
