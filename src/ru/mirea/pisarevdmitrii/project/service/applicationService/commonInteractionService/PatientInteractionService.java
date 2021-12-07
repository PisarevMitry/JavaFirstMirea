package ru.mirea.pisarevdmitrii.project.service.applicationService.commonInteractionService;

import ru.mirea.pisarevdmitrii.project.ConsoleApplication;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.HealthService;
import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;

import java.util.ArrayList;

public class PatientInteractionService {

    public ArrayList<HealthService> getAllAvailableHealthService() {
        return ConsoleApplication.getApplicationInitializer().getDatabaseConfig().getHealthServiceController().getAllHealthService();
    }

    public ArrayList<DateAndTime> getAllAvailableDate(HealthService appointmentHealthService) {
        return ConsoleApplication.getApplicationInitializer().getDatabaseConfig().getAppointmentController().getAllEmptyTime(appointmentHealthService.getMedicalSpecialization());
    }

    public ArrayList<Doctor> getAllAvailableDoctor(HealthService appointmentHealthService, DateAndTime appointmentDate) {
        return ConsoleApplication.getApplicationInitializer().getDatabaseConfig().getAppointmentController().getAllDoctorByEmptyTime(ConsoleApplication.applicationInitializer.getDatabaseConfig().getDoctorController().getAllDoctorByMedicalSpecialization(appointmentHealthService.getMedicalSpecialization()), appointmentDate);
    }

    public String getAvailableCabinet() {
        //ToDo выбор расположения
        return "122 Проспект Вернадского";
    }

    public void paymentAppointment() {
//ToDo вынести логику оплаты
    }

    public void signupAppointment() {

    }

}
