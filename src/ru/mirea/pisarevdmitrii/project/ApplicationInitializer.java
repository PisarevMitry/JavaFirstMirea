package ru.mirea.pisarevdmitrii.project;

import ru.mirea.pisarevdmitrii.project.config.DatabaseConfig;

public class ApplicationInitializer {
    private DatabaseConfig databaseConfig;

    public ApplicationInitializer() {
        onStartup();
    }

    private void onStartup() {
        databaseConfig = new DatabaseConfig();
    }

    public DatabaseConfig getDatabaseConfig() {
        return databaseConfig;
    }

    public void setDatabaseConfig(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }
}
