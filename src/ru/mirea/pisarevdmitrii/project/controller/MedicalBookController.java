package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;
import ru.mirea.pisarevdmitrii.project.service.MedicalBookService;

import java.util.ArrayList;

public class MedicalBookController {
    private MedicalBookService medicalBookService;

    public MedicalBookController(MedicalBookService medicalBookService) {
        this.medicalBookService = medicalBookService;
    }

    public ArrayList<MedicalBook> getAllMedicalBook() {
        return medicalBookService.getAllMedicalBook();
    }

    public MedicalBook getMedicalBook(MedicalBook patient) {
        return medicalBookService.getMedicalBook(patient);
    }

    public MedicalBook getMedicalBook(Integer index) {
        return medicalBookService.getMedicalBook(index);
    }

    public void postMedicalBook(MedicalBook patient) {
        medicalBookService.postMedicalBook(patient);
    }

    public void removeMedicalBook(MedicalBook patient) {
        medicalBookService.removeMedicalBook(patient);
    }

    public void updateMedicalBook(MedicalBook patient, MedicalBook patientNew) {
        medicalBookService.updateMedicalBook(patient, patientNew);
    }
}
