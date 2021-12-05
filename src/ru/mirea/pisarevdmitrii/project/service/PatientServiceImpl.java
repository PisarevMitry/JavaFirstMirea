package ru.mirea.pisarevdmitrii.project.service;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

import java.util.ArrayList;

public class PatientServiceImpl implements PatientService {

    public DatabaseTable<Patient> patientRepository;

    public PatientServiceImpl(DatabaseTable<Patient> patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public ArrayList<Patient> getAllPatient() {
        return patientRepository.getAll();
    }

    @Override
    public Patient getPatient(Patient patient) {
        return patientRepository.get(patientRepository.search(patient));
    }

    @Override
    public Patient getPatient(Integer index) {
        return patientRepository.get(index);
    }

    @Override
    public void postPatient(Patient patient) {
        patientRepository.add(patient);
        patient.setPatientId(patientRepository.getIndex());
    }

    @Override
    public void removePatient(Patient patient) {
        patientRepository.remove(patient);
    }


    public void updatePatient(Patient patient, Patient patientNew) {
        patientRepository.remove(patient);
        patientRepository.add(patientNew);
    }
}
