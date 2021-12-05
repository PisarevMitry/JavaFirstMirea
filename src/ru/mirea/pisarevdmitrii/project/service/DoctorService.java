package ru.mirea.pisarevdmitrii.project.service;

import ru.mirea.pisarevdmitrii.project.entity.Doctor;

import java.util.ArrayList;

public interface DoctorService {
    ArrayList<Doctor> getAllDoctor();

    Doctor getDoctor(Doctor doctor);

    Doctor getDoctor(Integer index);

    void postDoctor(Doctor doctor);

    void removeDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor, Doctor doctorNew);
}
