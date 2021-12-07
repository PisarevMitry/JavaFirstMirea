package ru.mirea.pisarevdmitrii.project.service.applicationService.consoleInteractionService.core;

import ru.mirea.pisarevdmitrii.project.service.applicationService.commonInteractionService.LoginService;

import java.util.Scanner;

public class ConsoleLoginService extends LoginService {

    private static final Scanner scanner = new Scanner(System.in);

    public void login() {
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
                String password;
                System.out.println("Введите фамилию: ");
                surname = scanner.next();
                System.out.println("Введите имя: ");
                name = scanner.next();
                System.out.println("Введите отчество или null, если нет отчества: ");
                patronymic = scanner.next();
                if (patronymic.equals("null")) {
                    patronymic = null;
                }
                System.out.println("Введите пароль: ");
                password = scanner.next();
                LoginService.authorization(surname, name, patronymic, password);
            }
            case 2 -> {
                String surname;
                String name;
                String patronymic;
                String password;
                String token;
                System.out.println("Введите фамилию: ");
                surname = scanner.next();
                System.out.println("Введите имя: ");
                name = scanner.next();
                System.out.println("Введите отчество или null, если нет отчества: ");
                patronymic = scanner.next();
                if (patronymic.equals("null")) {
                    patronymic = null;
                }
                System.out.println("Введите пароль: ");
                password = scanner.next();
                System.out.println("Введите токен регистрации (для обычного пользователя PATIENT: ");
                token = scanner.next();
                LoginService.registration(surname, name, patronymic, password, token);
            }
        }
    }
}
