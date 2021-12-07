package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.MedicalSpecialization;

public class DoctorRepository extends DatabaseTable<Doctor> {
    public DoctorRepository(String tableName) {
        super(tableName);
    }

    @Override
    public void initialization() {
        add(new Doctor("Спирина", "Мария", "Викторовна", "1234", MedicalSpecialization.AllergicAndImmunology));
        add(new Doctor("Кононец", "Елена", "Вячеславовна", "1234", MedicalSpecialization.AllergicAndImmunology));
        add(new Doctor("Безлепко", "Марина", "Геннадьевна", "1234", MedicalSpecialization.Oncology));
        add(new Doctor("Исаева", "Галина", "Ивановна", "1234", MedicalSpecialization.Oncology));
        add(new Doctor("Каменская", "Татьяна", "Ивановна", "1234", MedicalSpecialization.Therapy));
        add(new Doctor("Маркина", "Тамара", "Васильевна", "1234", MedicalSpecialization.Therapy));
    }
}
