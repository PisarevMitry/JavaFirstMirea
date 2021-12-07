package ru.mirea.pisarevdmitrii.project.entity;

import java.io.File;
import java.util.Objects;

public class MedicalBook {
    private long medicalBookId;
    private Patient patient;
    private File vaccinations;
    private File notes;

    public MedicalBook() {
    }

    public long getMedicalBookId() {
        return medicalBookId;
    }

    public void setMedicalBookId(long medicalBookId) {
        this.medicalBookId = medicalBookId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public File getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(File vaccinations) {
        this.vaccinations = vaccinations;
    }

    public File getNotes() {
        return notes;
    }

    public void setNotes(File notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalBook that = (MedicalBook) o;
        return patient.equals(that.patient) && Objects.equals(vaccinations, that.vaccinations) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, vaccinations, notes);
    }

    @Override
    public String toString() {
        return "MedicalBook{" +
                "medicalBookId=" + medicalBookId +
                ", patient=" + patient +
                ", vaccinations=" + vaccinations +
                ", notes=" + notes +
                '}';
    }
}
