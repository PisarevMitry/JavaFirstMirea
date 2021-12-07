package ru.mirea.pisarevdmitrii.project.entity;

import java.util.Objects;

public class Doctor {
    private long doctorId;
    private String surname;
    private String name;
    private String patronymic;
    private String password;
    private MedicalSpecialization medicalSpecialization;

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

    public void setDoctorId(long doctorId) {
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

    public MedicalSpecialization getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(MedicalSpecialization medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
