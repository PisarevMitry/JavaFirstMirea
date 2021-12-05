package ru.mirea.task21.table;

import ru.mirea.task16.Appointment;
import ru.mirea.task16.MedicalBook;
import ru.mirea.task16.Patient;
import ru.mirea.task21.DatabaseTable;

import java.util.ArrayList;
import java.util.Map;

public class PatientTable extends DatabaseTable<Patient> {
    private String surname;
    private String name;
    private String patronymic;

    private MedicalBook medicalBook;
    private ArrayList<Appointment> appointments;

    public PatientTable(String tableName) {
        super(tableName);
    }

    public PatientTable(String tableName, Map<Long, Patient> store) {
        super(tableName, store);
    }
}
