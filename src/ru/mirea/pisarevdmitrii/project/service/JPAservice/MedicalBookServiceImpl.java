package ru.mirea.pisarevdmitrii.project.service.JPAservice;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;

import java.util.ArrayList;

public class MedicalBookServiceImpl implements MedicalBookService {

    public DatabaseTable<MedicalBook> medicalBookRepository;

    public MedicalBookServiceImpl(DatabaseTable<MedicalBook> medicalBookRepository) {
        this.medicalBookRepository = medicalBookRepository;
    }

    @Override
    public ArrayList<MedicalBook> getAllMedicalBook() {
        return medicalBookRepository.getAll();
    }

    @Override
    public MedicalBook getMedicalBook(MedicalBook medicalBook) {
        return medicalBookRepository.get(medicalBookRepository.search(medicalBook));
    }

    @Override
    public MedicalBook getMedicalBook(Integer index) {
        return medicalBookRepository.get(index);
    }

    @Override
    public void postMedicalBook(MedicalBook medicalBook) {
        medicalBookRepository.add(medicalBook);
        medicalBook.setMedicalBookId(medicalBookRepository.getIndex());
    }

    @Override
    public void removeMedicalBook(MedicalBook medicalBook) {
        medicalBookRepository.remove(medicalBook);
    }

    @Override
    public void updateMedicalBook(MedicalBook medicalBook, MedicalBook medicalBookNew) {
        medicalBookRepository.remove(medicalBook);
        medicalBookRepository.add(medicalBookNew);
    }
}
