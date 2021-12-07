package ru.mirea.pisarevdmitrii.project.service.applicationService.consoleInteractionService.core;

import java.util.ArrayList;

public class ConsoleService {
    public static <V> void printIndexedList(ArrayList<V> arrayList) {
        for (int a = 0; a < arrayList.size(); a++) {
            System.out.println(a + " - " + arrayList.get(a) + ";");
        }
    }
}
