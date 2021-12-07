package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.Patient;
import ru.mirea.pisarevdmitrii.project.service.JPAservice.PatientService;

import java.util.ArrayList;

public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    public ArrayList<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }

    public Patient getPatient(Patient patient) {
        return patientService.getPatient(patient);
    }

    public Patient getPatient(Integer index) {
        return patientService.getPatient(index);
    }

    public void postPatient(Patient patient) {
        patientService.postPatient(patient);
    }

    public void removePatient(Patient patient) {
        patientService.removePatient(patient);
    }

    public void updatePatient(Patient patient, Patient patientNew) {
        patientService.updatePatient(patient, patientNew);
    }
}
