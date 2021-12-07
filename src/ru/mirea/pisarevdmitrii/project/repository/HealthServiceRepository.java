package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.HealthService;
import ru.mirea.pisarevdmitrii.project.entity.MedicalSpecialization;

public class HealthServiceRepository extends DatabaseTable<HealthService> {
    public HealthServiceRepository(String tableName) {
        super(tableName);
    }

    @Override
    public void initialization() {
        add(new HealthService("Услуга 1", 1000, MedicalSpecialization.Therapy));
        add(new HealthService("Услуга 2", 2000, MedicalSpecialization.AllergicAndImmunology));
        add(new HealthService("Услуга 3", 3000, MedicalSpecialization.AllergicAndImmunology));
        add(new HealthService("Услуга 4", 100, MedicalSpecialization.AllergicAndImmunology));
        add(new HealthService("Услуга 5", 10000, MedicalSpecialization.Oncology));
        add(new HealthService("Услуга 6", 500, MedicalSpecialization.Oncology));
        add(new HealthService("Услуга 7", 6000, MedicalSpecialization.Not));
    }
}
