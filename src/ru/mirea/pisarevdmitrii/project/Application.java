package ru.mirea.pisarevdmitrii.project;

import ru.mirea.pisarevdmitrii.project.entity.*;
import ru.mirea.pisarevdmitrii.project.entity.core.DateAndTime;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayByCreditCard;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayByPayPal;
import ru.mirea.pisarevdmitrii.project.service.paymentService.PayStrategy;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {
    private static ApplicationInitializer applicationInitializer;
    private static Patient patient = null;
    private static Doctor doctor = null;
    private static Patient admin = null;
    private static final Scanner scanner = new Scanner(System.in);

    public static void Start() {
        applicationInitializer = new ApplicationInitializer();
    }

    public static void main(String[] args) {
        Start();
        System.out.println("""
                Выберите действие:
                1 - Авторизация;
                2 - Регистрация;
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                String surname;
                String name;
                String patronymic;
                System.out.println("Введите фамилию: ");
                surname = scanner.next();
                System.out.println("Введите имя: ");
                name = scanner.next();
                System.out.println("Введите отчество: ");
                patronymic = scanner.next();
                try {
                    patient = applicationInitializer.getDatabaseConfig().getPatientController().getPatient(new Patient(surname, name, patronymic));
                    doctor = applicationInitializer.getDatabaseConfig().getDoctorController().getDoctor(new Doctor(surname, name, patronymic));
                    if (Objects.equals(surname, "admin"))
                        admin = new Patient();
                    if (patient == null && doctor == null && admin == null) {
                        System.out.println("Данный пользователь не найден, создайте пользователя.");
                        throw new Exception("not found entity");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 2 -> {
                String surname;
                String name;
                String patronymic;
                System.out.println("Введите фамилию: ");
                surname = scanner.next();
                System.out.println("Введите имя: ");
                name = scanner.next();
                System.out.println("Введите отчество: ");
                patronymic = scanner.next();
                try {
                    applicationInitializer.getDatabaseConfig().getPatientController().postPatient(new Patient(surname, name, patronymic));
                    patient = applicationInitializer.getDatabaseConfig().getPatientController().getPatient(new Patient(surname, name, patronymic));
                    if (patient == null) {
                        System.out.println("Пользователь не создан, проверьте правильность введенных данных.");
                        throw new Exception("can't create entity");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
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
                    DateAndTime appointmentDate;
                    Doctor appointmentDoctor;
                    HealthService appointmentHealthService;
                    String appointmentCabinet;
                    Patient appointmentPatient;

                    System.out.println("Выберите услугу:");
                    ArrayList<HealthService> healthServices = applicationInitializer.getDatabaseConfig().getHealthServiceController().getAllHealthService();
                    IntStream.range(0, healthServices.size()).mapToObj(i -> i + " - " + healthServices.get(i) + ";").forEachOrdered(System.out::println);
                    appointmentHealthService = healthServices.get(scanner.nextInt());

                    //проработать подбор свободного времени
                    System.out.println("Выберите дату и время:");
                    System.out.println("Введите год: ");
                    int year = scanner.nextInt();
                    System.out.println("Введите месяц: ");
                    int month = scanner.nextInt();
                    System.out.println("Введите день: ");
                    int day = scanner.nextInt();
                    System.out.println("Введите час: ");
                    int hour = scanner.nextInt();
                    System.out.println("Введите минуту: ");
                    int minute = scanner.nextInt();
                    appointmentDate = new DateAndTime(year, month, day, hour, minute);

                    System.out.println("Выберите врача:");
                    ArrayList<Doctor> doctors = applicationInitializer.getDatabaseConfig().getAppointmentController().getAllDoctorByEmptyTime(applicationInitializer.getDatabaseConfig().getDoctorController().getAllDoctorByMedicalSpecialization(appointmentHealthService.getMedicalSpecialization()), appointmentDate);
                    IntStream.range(0, doctors.size()).mapToObj(i -> i + " - " + doctors.get(i) + ";").forEachOrdered(System.out::println);
                    appointmentDoctor = doctors.get(scanner.nextInt());

                    appointmentCabinet = "Кабинет определяется дополнительной логикой";

                    appointmentPatient = patient;
                    Appointment appointment = new Appointment(appointmentDate, appointmentDoctor, appointmentHealthService, appointmentCabinet, appointmentPatient);

                    PayStrategy payStrategy;
                    System.out.println("""
                            Выберите способ оплаты:
                            1 - Кредитная/дебетовая карта;
                            2 - PayPal;
                            """);
                    switch (scanner.nextInt()) {
                        case 1:
                            payStrategy = new PayByCreditCard();
                        case 2:
                            payStrategy = new PayByPayPal();
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
                    }

                    appointment.processOrder(payStrategy);
                    applicationInitializer.getDatabaseConfig().getAppointmentController().postAppointment(new Appointment(appointmentDate, appointmentDoctor, appointmentHealthService, appointmentCabinet, appointmentPatient));
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
}
