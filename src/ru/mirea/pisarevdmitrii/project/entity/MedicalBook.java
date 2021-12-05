package ru.mirea.pisarevdmitrii.project.entity;

import java.io.File;

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
}
