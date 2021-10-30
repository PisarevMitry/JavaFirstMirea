package ru.mirea.task15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static List<String> replace(List<String> list, String old_str, String new_str) {
        String str = "";
        for (int i = 0; i < list.size(); ++i) {
            if (i != list.size() - 1)
                str += list.get(i) + "\n";
            else
                str += list.get(i);
        }
        str = str.replaceFirst(old_str, new_str);
        list = Arrays.asList(str.split("\n"));

        return list;
    }

    public static void print_menu() {
        System.out.println("\n1.Перезаписать файл");
        System.out.println("2.Вывести файл");
        System.out.println("3.Заменить информацию в файле");
        System.out.println("4.Добавить в конец файла");
        System.out.println("0.Выход");
        System.out.print("Выбор: ");
    }

    public static void main(String[] args) {
        boolean menu = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        String data;
        String path = "./src/ru/mirea/task15/file.txt";

        while (menu) {
            print_menu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0: // Выход
                {
                    menu = false;
                    break;
                }

                case 1:// Перезаписать файл
                {
                    try (FileWriter writer = new FileWriter(path, false)) {
                        System.out.print("Введите данные: ");
                        data = sc.nextLine();
                        writer.write(data);
                        writer.close();
                        System.out.println("Данные записаны в файл.");
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 2: // Вывести файл
                {
                    try (FileReader reader = new FileReader(path)) {
                        // читаем посимвольно
                        int c;
                        while ((c = reader.read()) != -1) {

                            System.out.print((char) c);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 3: // Заменить информацию в файле
                {
                    String new_data;
                    File file = new File(path);
                    List<String> lines;
                    try (FileReader reader = new FileReader(path)) {
                        lines = Files.readAllLines(file.toPath());
                        System.out.print("Введите данные, которые хотите заменить: ");
                        data = sc.nextLine();
                        System.out.print("На что хотите заменить: ");
                        new_data = sc.nextLine();
                        lines = replace(lines, data, new_data);
                        Files.write(file.toPath(), lines);
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 4: // Добавить в конец файла
                {
                    try (FileWriter writer = new FileWriter(path, true)) {
                        System.out.print("Введите данные: ");
                        data = sc.nextLine();
                        writer.write(System.getProperty("line.separator") + data);
                        writer.close();
                        System.out.println("Данные записаны в конец файла.");
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                    break;
                }
            }
        }
    }
}
