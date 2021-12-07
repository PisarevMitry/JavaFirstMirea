package ru.mirea.pisarevdmitrii.project.service.applicationService.consoleInteractionService.core;

import ru.mirea.pisarevdmitrii.project.ConsoleApplication;
import ru.mirea.pisarevdmitrii.project.entity.Appointment;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.HealthService;
import ru.mirea.pisarevdmitrii.project.entity.Patient;
import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;
import ru.mirea.pisarevdmitrii.project.service.applicationService.commonInteractionService.PatientInteractionService;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayByCreditCard;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayByPayPal;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayStrategy;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolePatientInteractionService extends PatientInteractionService {

    @Override
    public void signupAppointment() {
        Scanner scanner = new Scanner(System.in);

        DateAndTime appointmentDate;
        Doctor appointmentDoctor;
        HealthService appointmentHealthService;
        String appointmentCabinet;
        Patient appointmentPatient;

        System.out.println("Выберите услугу:");
        ArrayList<HealthService> healthServices = getAllAvailableHealthService();
        ConsoleService.printIndexedList(healthServices);
        appointmentHealthService = healthServices.get(scanner.nextInt());

        System.out.println("Выберите удобное время:");
        ArrayList<DateAndTime> date = getAllAvailableDate(appointmentHealthService);
        ConsoleService.printIndexedList(date);
        appointmentDate = date.get(scanner.nextInt());

        System.out.println("Выберите врача:");
        ArrayList<Doctor> doctors = getAllAvailableDoctor(appointmentHealthService, appointmentDate);
        ConsoleService.printIndexedList(doctors);
        appointmentDoctor = doctors.get(scanner.nextInt());

        //ToDo
        appointmentCabinet = getAvailableCabinet();

        appointmentPatient = ConsoleApplication.getPatient();

        Appointment appointment = new Appointment(appointmentDate, appointmentDoctor, appointmentHealthService, appointmentCabinet, appointmentPatient);

        //ToDo
        PayStrategy payStrategy;
        System.out.println("""
                Выберите способ оплаты:
                1 - Кредитная/дебетовая карта;
                2 - PayPal;
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                payStrategy = new PayByCreditCard();
            }
            case 2 -> {
                payStrategy = new PayByPayPal();
            }
            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
        }
        appointment.processOrder(payStrategy);
    }
}
