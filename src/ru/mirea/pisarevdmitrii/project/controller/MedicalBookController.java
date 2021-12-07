package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;
import ru.mirea.pisarevdmitrii.project.service.JPAservice.MedicalBookService;

import java.util.ArrayList;

public class MedicalBookController {
    private MedicalBookService medicalBookService;

    public MedicalBookController(MedicalBookService medicalBookService) {
        this.medicalBookService = medicalBookService;
    }

    public ArrayList<MedicalBook> getAllMedicalBook() {
        return medicalBookService.getAllMedicalBook();
    }

    public MedicalBook getMedicalBook(MedicalBook medicalBook, AccessType type) {
        return new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(medicalBook), type);
    }

    public MedicalBook getMedicalBook(Integer index, AccessType type) {
        return new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(index), type);
    }

    public void postMedicalBook(MedicalBook medicalBook, AccessType type) {
        medicalBookService.postMedicalBook(new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(medicalBook), type));
    }

    public void removeMedicalBook(MedicalBook medicalBook, AccessType type) {
        medicalBookService.removeMedicalBook(new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(medicalBook), type));
    }

    public void updateMedicalBook(MedicalBook medicalBook, MedicalBook medicalBookNew, AccessType type) {
        medicalBookService.updateMedicalBook(new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(medicalBook), type), new MedicalBookAccessControllerFactory().createFactory(medicalBookService.getMedicalBook(medicalBook), type));
    }
}
