package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.task21.DatabaseTable;

public class DoctorRepository extends DatabaseTable<Doctor> {
    public DoctorRepository(String tableName) {
        super(tableName);
    }
}
