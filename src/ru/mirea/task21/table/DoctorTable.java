package ru.mirea.task21.table;

import ru.mirea.task16.Appointment;
import ru.mirea.task16.Doctor;
import ru.mirea.task17.MedicalSpecialization;
import ru.mirea.task21.DatabaseTable;

import java.util.ArrayList;
import java.util.Map;

public class DoctorTable extends DatabaseTable<Doctor> {
    private String surname;
    private String name;
    private String patronymic;

    MedicalSpecialization medicalSpecialization;
    private ArrayList<Appointment> appointments;

    public DoctorTable(String tableName) {
        super(tableName);
    }

    public DoctorTable(String tableName, Map<Long, Doctor> store) {
        super(tableName, store);
    }
}
