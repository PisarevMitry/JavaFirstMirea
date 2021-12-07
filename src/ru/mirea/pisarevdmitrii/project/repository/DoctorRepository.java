package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.MedicalSpecialization;

public class DoctorRepository extends DatabaseTable<Doctor> {
    public DoctorRepository(String tableName) {
        super(tableName);
        initialization();
    }

    @Override
    public void initialization() {
        add(new Doctor("Спирина", "Мария", "Викторовна", MedicalSpecialization.AllergicAndImmunology));
        add(new Doctor("Кононец", "Елена", "Вячеславовна", MedicalSpecialization.AllergicAndImmunology));
        add(new Doctor("Безлепко", "Марина", "Геннадьевна", MedicalSpecialization.Oncology));
        add(new Doctor("Исаева", "Галина", "Ивановна", MedicalSpecialization.Oncology));
        add(new Doctor("Каменская", "Татьяна", "Ивановна", MedicalSpecialization.Therapy));
        add(new Doctor("Маркина", "Тамара", "Васильевна", MedicalSpecialization.Therapy));
    }
}
