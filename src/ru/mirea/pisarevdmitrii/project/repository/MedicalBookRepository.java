package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;

public class MedicalBookRepository extends DatabaseTable<MedicalBook> {
    public MedicalBookRepository(String tableName) {
        super(tableName);
    }

    @Override
    public void initialization() {
    }
}
