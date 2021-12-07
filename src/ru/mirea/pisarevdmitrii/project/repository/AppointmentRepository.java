package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Appointment;

public class AppointmentRepository extends DatabaseTable<Appointment> {
    public AppointmentRepository(String tableName) {
        super(tableName);
    }

    @Override
    public void initialization() {
    }

}
