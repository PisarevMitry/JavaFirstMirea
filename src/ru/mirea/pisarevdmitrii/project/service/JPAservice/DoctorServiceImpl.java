package ru.mirea.pisarevdmitrii.project.service.JPAservice;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;

import java.util.ArrayList;

public class DoctorServiceImpl implements DoctorService {

    public DatabaseTable<Doctor> doctorRepository;

    public DoctorServiceImpl(DatabaseTable<Doctor> doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public ArrayList<Doctor> getAllDoctor() {
        return doctorRepository.getAll();
    }

    @Override
    public Doctor getDoctor(Doctor doctor) {
        return doctorRepository.get(doctorRepository.search(doctor));
    }

    @Override
    public Doctor getDoctor(Integer index) {
        return doctorRepository.get(index);
    }

    @Override
    public void postDoctor(Doctor doctor) {
        doctorRepository.add(doctor);
        doctor.setDoctorId(doctorRepository.getIndex());
    }

    @Override
    public void removeDoctor(Doctor doctor) {
        doctorRepository.remove(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor, Doctor doctorNew) {
        doctorRepository.remove(doctor);
        doctorRepository.add(doctorNew);
    }
}
