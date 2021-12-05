package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.task21.DatabaseTable;

public class AppointmentRepository extends DatabaseTable<Appointment> {
    public AppointmentRepository(String tableName) {
        super(tableName);
    }
}
