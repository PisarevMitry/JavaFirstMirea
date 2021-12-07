package ru.mirea.pisarevdmitrii.project.service.JPAservice;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.HealthService;

import java.util.ArrayList;

public class HealthServiceServiceImpl implements HealthServiceService {

    public DatabaseTable<HealthService> healthServiceRepository;

    public HealthServiceServiceImpl(DatabaseTable<HealthService> healthServiceRepository) {
        this.healthServiceRepository = healthServiceRepository;
    }

    @Override
    public ArrayList<HealthService> getAllHealthService() {
        return healthServiceRepository.getAll();
    }

    @Override
    public HealthService getHealthService(HealthService healthService) {
        return healthServiceRepository.get(healthServiceRepository.search(healthService));
    }

    @Override
    public HealthService getHealthService(Integer index) {
        return healthServiceRepository.get(index);
    }

    @Override
    public void postHealthService(HealthService healthService) {
        healthServiceRepository.add(healthService);
        healthService.setHealthServiceId(healthServiceRepository.getIndex());
    }

    @Override
    public void removeHealthService(HealthService healthService) {
        healthServiceRepository.remove(healthService);
    }

    @Override
    public void updateHealthService(HealthService healthService, HealthService healthServiceNew) {
        healthServiceRepository.remove(healthService);
        healthServiceRepository.add(healthServiceNew);
    }
}
