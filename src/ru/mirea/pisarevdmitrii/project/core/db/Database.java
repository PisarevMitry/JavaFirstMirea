package ru.mirea.pisarevdmitrii.project.core.db;

import java.util.ArrayList;

public class Database {
    protected String databaseName;
    protected ArrayList<DatabaseTable> databaseTables;

    public Database(String databaseName, ArrayList<DatabaseTable> databaseTables) {
        this.databaseName = databaseName;
        this.databaseTables = databaseTables;
        initialization();
    }

    public Database(String databaseName) {
        this.databaseName = databaseName;
        this.databaseTables = new ArrayList<>();
    }

    public Database() {
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ArrayList<DatabaseTable> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(ArrayList<DatabaseTable> databaseTables) {
        this.databaseTables = databaseTables;
    }

    public void addDatabaseTables(DatabaseTable databaseTable) {
        try {
            databaseTables.add(databaseTable);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public DatabaseTable searchDatabaseTable(String tableName) {
        for (DatabaseTable databaseTable : databaseTables) {
            if (databaseTable.getTableName().equals(tableName)) {
                return databaseTable;
            }
        }
        return null;
    }

    public void initialization() {
        for (DatabaseTable databaseTable : databaseTables) {
            databaseTable.initialization();
        }
    }
}
