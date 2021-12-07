package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

import java.io.File;

enum AccessType {
    AccessDenied,
    ReadAccess,
    ReadWriteAccess
}

public class MedicalBookAccessControllerFactory {
    public MedicalBook medicalBook;

    public MedicalBook createFactory(MedicalBook medicalBook, AccessType type) {
        this.medicalBook = medicalBook;
        switch (type) {
            case ReadAccess:
                this.medicalBook = new ReadAccess();
                break;
            case ReadWriteAccess:
                this.medicalBook = new ReadWriteAccess();
                break;
            case AccessDenied:
                this.medicalBook = new DeniedAccess();
                break;
        }
        return this.medicalBook;
    }
}

class DeniedAccess extends MedicalBook {

    @Override
    public long getMedicalBookId() {
        return 0;
    }

    @Override
    public void setMedicalBookId(long medicalBookId) {
    }

    @Override
    public Patient getPatient() {
        return null;
    }

    @Override
    public void setPatient(Patient patient) {

    }

    @Override
    public File getVaccinations() {
        return null;
    }

    @Override
    public void setVaccinations(File vaccinations) {
    }

    @Override
    public File getNotes() {
        return null;
    }

    @Override
    public void setNotes(File notes) {
    }

    @Override
    public String toString() {
        return "DeniedAccess{}";
    }
}

class ReadAccess extends MedicalBook {

    @Override
    public void setMedicalBookId(long medicalBookId) {
    }

    @Override
    public void setPatient(Patient patient) {
    }

    @Override
    public void setVaccinations(File vaccinations) {
    }

    @Override
    public void setNotes(File notes) {
    }
}

class ReadWriteAccess extends MedicalBook {
}