package ru.mirea.task21;

import java.util.HashMap;
import java.util.Map;

public class DatabaseTable<V> {

    private String tableName;
    private final Map<Long, V> table;

    public DatabaseTable(String tableName) {
        this.tableName = tableName;
        this.table = new HashMap<>();
    }

    public DatabaseTable(String tableName, Map<Long, V> store) {
        this.tableName = tableName;
        this.table = store;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<Long, V> getTable() {
        return table;
    }

    public void add(Long key, V value) {
        table.put(key, value);
    }

    public void delete(Long key, V value) {
        table.remove(key, value);
    }

    public V get(Long key) {
        return table.get(key);
    }
}
