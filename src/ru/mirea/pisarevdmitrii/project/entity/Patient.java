package ru.mirea.pisarevdmitrii.project.entity;

import java.util.Objects;

public class Patient {
    public int patientId;
    private String surname;
    private String name;
    private String patronymic;

    public Patient() {
    }

    public Patient(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return surname.equals(patient.surname) && name.equals(patient.name) && Objects.equals(patronymic, patient.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
