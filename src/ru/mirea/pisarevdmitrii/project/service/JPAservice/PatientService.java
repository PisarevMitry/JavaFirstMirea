package ru.mirea.pisarevdmitrii.project.service.JPAservice;

import ru.mirea.pisarevdmitrii.project.entity.Patient;

import java.util.ArrayList;

public interface PatientService {

    ArrayList<Patient> getAllPatient();

    Patient getPatient(Patient patient);

    Patient getPatient(Integer index);

    void postPatient(Patient patient);

    void removePatient(Patient patient);

    void updatePatient(Patient patient, Patient patientNew);
}
