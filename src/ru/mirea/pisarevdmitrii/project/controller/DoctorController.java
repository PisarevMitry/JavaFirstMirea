package ru.mirea.pisarevdmitrii.project.controller;


import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.MedicalSpecialization;
import ru.mirea.pisarevdmitrii.project.service.JPAservice.DoctorService;

import java.util.ArrayList;

public class DoctorController {
    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    public ArrayList<Doctor> getAllDoctor() {
        return doctorService.getAllDoctor();
    }

    public Doctor getDoctor(Doctor doctor) {
        return doctorService.getDoctor(doctor);
    }

    public Doctor getDoctor(Integer index) {
        return doctorService.getDoctor(index);
    }

    public void postDoctor(Doctor doctor) {
        doctorService.postDoctor(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        doctorService.removeDoctor(doctor);
    }

    public void updateDoctor(Doctor doctor, Doctor doctorNew) {
        doctorService.updateDoctor(doctor, doctorNew);
    }

    public ArrayList<Doctor> getAllDoctorByMedicalSpecialization(MedicalSpecialization medicalSpecialization) {
        ArrayList<Doctor> doctors = doctorService.getAllDoctor();
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getMedicalSpecialization() != medicalSpecialization) {
                doctors.remove(i);
            }
        }
        return doctors;

    }


}
