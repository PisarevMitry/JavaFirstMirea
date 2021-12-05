package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

public class PatientRepository extends DatabaseTable<Patient> {
    public PatientRepository(String tableName) {
        super(tableName);
    }
}
