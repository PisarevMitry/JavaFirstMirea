package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.entity.HealthService;
import ru.mirea.task21.DatabaseTable;

public class HealthServiceRepository extends DatabaseTable<HealthService> {
    public HealthServiceRepository(String tableName) {
        super(tableName);
    }
}
