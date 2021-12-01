package ru.mirea.task16;

import ru.mirea.task17.MedicalSpecialization;

import java.util.ArrayList;

public class Doctor {
    private String surname;
    private String name;
    private String patronymic;

    MedicalSpecialization medicalSpecialization;
    private ArrayList<Appointment> appointments;
}
