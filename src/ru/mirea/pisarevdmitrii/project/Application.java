package ru.mirea.pisarevdmitrii.project;

import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

import java.util.Scanner;

public class Application {
    private static ApplicationInitializer applicationInitializer;
    private static Patient patient = null;
    static Doctor doctor = null;
    static Scanner scanner = new Scanner(System.in);

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
                    if (patient == null && doctor == null) {
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
                    System.out.println("""
                            Выберите действие:
                            1 - Записаться на прием;
                            2 - Записаться на диагностику;
                            3 - Записаться на анализы;
                            4 - Перейти назад;
                            """);
                }
                case 2 -> {
                    applicationInitializer.getDatabaseConfig().getPatientController().getAllPatient().stream().forEach(System.out::println);

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
    }
}
