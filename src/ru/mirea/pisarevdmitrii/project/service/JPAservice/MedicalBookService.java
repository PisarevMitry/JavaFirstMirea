package ru.mirea.pisarevdmitrii.project.service.JPAservice;

import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;

import java.util.ArrayList;

public interface MedicalBookService {
    ArrayList<MedicalBook> getAllMedicalBook();

    MedicalBook getMedicalBook(MedicalBook medicalBook);

    MedicalBook getMedicalBook(Integer index);

    void postMedicalBook(MedicalBook medicalBook);

    void removeMedicalBook(MedicalBook medicalBook);

    void updateMedicalBook(MedicalBook medicalBook, MedicalBook medicalBookNew);
}
