package ru.mirea.pisarevdmitrii.project;

import ru.mirea.pisarevdmitrii.project.entity.*;
import ru.mirea.pisarevdmitrii.project.service.applicationService.consoleInteractionService.core.ConsoleLoginService;
import ru.mirea.pisarevdmitrii.project.service.applicationService.consoleInteractionService.core.ConsolePatientInteractionService;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleApplication {
    public static ApplicationInitializer applicationInitializer;
    public static Patient patient = null;
    public static Doctor doctor = null;
    public static Patient admin = null;
    private static final Scanner scanner = new Scanner(System.in);
    private final static ConsoleLoginService consoleLoginService = new ConsoleLoginService();
    private final static ConsolePatientInteractionService consolePatientInteractionService = new ConsolePatientInteractionService();

    public static void Start() {
        applicationInitializer = new ApplicationInitializer();
    }

    public static void main(String[] args) {
        Start();

        /**
        Блок регистрации и авторизации
         **/
        consoleLoginService.login();

        /**
        Блок пользователя
         **/

        while (patient != null) {
            System.out.println("""
                    Выберите действие:
                    1 - Записаться на прием/диагностику/анализы;
                    2 - Отменить запись на прием/диагностику/анализы;
                    3 - Перенести запись на прием/диагностику/анализы на другое время;
                    4 - Посмотреть медицинскую карту;
                    5 - Выйти из приложения;
                    """);
            switch (scanner.nextInt()) {
                case 1 -> {
                    consolePatientInteractionService.signupAppointmentConsole();
                }
                case 2 -> {


                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    patient = null;
                }
            }
        }

        while (admin != null) {
            System.out.println("""
                    Выберите действие:
                    1 - Вывести все таблицы;
                                        
                    2 - Вывести таблицу докторов
                    3 - Вывести таблицу пациентов
                    4 - Вывести таблицу записей
                    5 - Вывести таблицу медицинских книг
                    6 - Вывести таблицу услуг
                    7 - Вывести таблицу записей
                    8 - Вывести таблицу записей
                    0 - Выйти из приложения;
                    """);
            switch (scanner.nextInt()) {
                case 1 -> {

                }
                case 2 -> {
                    ArrayList<Doctor> objects = applicationInitializer.getDatabaseConfig().getDoctorController().getAllDoctor();
                    for (Doctor value : objects) {
                        System.out.println(value);
                    }
                }
                case 3 -> {
                    ArrayList<Patient> objects = applicationInitializer.getDatabaseConfig().getPatientController().getAllPatient();
                    for (Patient value : objects) {
                        System.out.println(value);
                    }
                }
                case 4 -> {
                    ArrayList<Appointment> objects = applicationInitializer.getDatabaseConfig().getAppointmentController().getAllAppointment();
                    for (Appointment value : objects) {
                        System.out.println(value);
                    }
                }
                case 5 -> {
                    ArrayList<MedicalBook> objects = applicationInitializer.getDatabaseConfig().getMedicalBookController().getAllMedicalBook();
                    for (MedicalBook value : objects) {
                        System.out.println(value);
                    }
                }
                case 6 -> {
                    ArrayList<HealthService> objects = applicationInitializer.getDatabaseConfig().getHealthServiceController().getAllHealthService();
                    for (HealthService value : objects) {
                        System.out.println(value);
                    }
                }
                case 0 -> {
                    admin = null;
                }
            }
        }
    }

    public static ApplicationInitializer getApplicationInitializer() {
        return applicationInitializer;
    }

    public static void setApplicationInitializer(ApplicationInitializer applicationInitializer) {
        ConsoleApplication.applicationInitializer = applicationInitializer;
    }

    public static Patient getPatient() {
        return patient;
    }

    public static void setPatient(Patient patient) {
        ConsoleApplication.patient = patient;
    }

    public static Doctor getDoctor() {
        return doctor;
    }

    public static void setDoctor(Doctor doctor) {
        ConsoleApplication.doctor = doctor;
    }

    public static Patient getAdmin() {
        return admin;
    }

    public static void setAdmin(Patient admin) {
        ConsoleApplication.admin = admin;
    }
}
