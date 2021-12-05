package ru.mirea.pisarevdmitrii.project.service;

import ru.mirea.pisarevdmitrii.project.entity.HealthService;

import java.util.ArrayList;

public interface HealthServiceService {
    ArrayList<HealthService> getAllHealthService();

    HealthService getHealthService(HealthService healthService);

    HealthService getHealthService(Integer index);

    void postHealthService(HealthService healthService);

    void removeHealthService(HealthService healthService);

    void updateHealthService(HealthService healthService, HealthService healthServiceNew);
}
