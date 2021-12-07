package ru.mirea.pisarevdmitrii.project.config;

import ru.mirea.pisarevdmitrii.project.controller.*;
import ru.mirea.pisarevdmitrii.project.core.db.Database;
import ru.mirea.pisarevdmitrii.project.repository.*;
import ru.mirea.pisarevdmitrii.project.service.JPAservice.*;

public class DatabaseConfig {

    private Database database;
    private AppointmentController appointmentController;
    private DoctorController doctorController;
    private PatientController patientController;
    private MedicalBookController medicalBookController;
    private HealthServiceController healthServiceController;

    public DatabaseConfig() {
        database = new Database("medical_application");
        database.addDatabaseTables(new AppointmentRepository("appointment"));
        database.addDatabaseTables(new DoctorRepository("doctor"));
        database.addDatabaseTables(new PatientRepository("patient"));
        database.addDatabaseTables(new MedicalBookRepository("medical_book"));
        database.addDatabaseTables(new HealthServiceRepository("health_service"));

        appointmentController = new AppointmentController(new AppointmentServiceImpl(database.searchDatabaseTable("appointment")));
        doctorController = new DoctorController(new DoctorServiceImpl(database.searchDatabaseTable("doctor")));
        patientController = new PatientController(new PatientServiceImpl(database.searchDatabaseTable("patient")));
        medicalBookController = new MedicalBookController(new MedicalBookServiceImpl(database.searchDatabaseTable("medical_book")));
        healthServiceController = new HealthServiceController(new HealthServiceServiceImpl(database.searchDatabaseTable("health_service")));

    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public AppointmentController getAppointmentController() {
        return appointmentController;
    }

    public void setAppointmentController(AppointmentController appointmentController) {
        this.appointmentController = appointmentController;
    }

    public DoctorController getDoctorController() {
        return doctorController;
    }

    public void setDoctorController(DoctorController doctorController) {
        this.doctorController = doctorController;
    }

    public PatientController getPatientController() {
        return patientController;
    }

    public void setPatientController(PatientController patientController) {
        this.patientController = patientController;
    }

    public MedicalBookController getMedicalBookController() {
        return medicalBookController;
    }

    public void setMedicalBookController(MedicalBookController medicalBookController) {
        this.medicalBookController = medicalBookController;
    }

    public HealthServiceController getHealthServiceController() {
        return healthServiceController;
    }

    public void setHealthServiceController(HealthServiceController healthServiceController) {
        this.healthServiceController = healthServiceController;
    }
}
