package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.HealthService;
import ru.mirea.pisarevdmitrii.project.service.HealthServiceService;

import java.util.ArrayList;

public class HealthServiceController {
    private HealthServiceService healthServiceService;

    public HealthServiceController(HealthServiceService healthServiceService) {
        this.healthServiceService = healthServiceService;
    }

    public ArrayList<HealthService> getAllHealthService() {
        return healthServiceService.getAllHealthService();
    }

    public HealthService getHealthService(HealthService healthService) {
        return healthServiceService.getHealthService(healthService);
    }

    public HealthService getHealthService(Integer index) {
        return healthServiceService.getHealthService(index);
    }

    public void postHealthService(HealthService healthService) {
        healthServiceService.postHealthService(healthService);
    }

    public void removePatient(HealthService healthService) {
        healthServiceService.removeHealthService(healthService);
    }

    public void updatePatient(HealthService healthService, HealthService healthServiceNew) {
        healthServiceService.updateHealthService(healthService, healthServiceNew);
    }
}
