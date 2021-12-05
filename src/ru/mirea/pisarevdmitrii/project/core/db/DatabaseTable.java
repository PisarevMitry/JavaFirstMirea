package ru.mirea.pisarevdmitrii.project.core.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class DatabaseTable<V> {

    private String tableName;
    private HashMap<Integer, V> entity;
    private int index;

    public DatabaseTable(String tableName) {
        this.tableName = tableName;
        this.entity = new HashMap<Integer, V>();
        index = 0;
    }

    public DatabaseTable(String tableName, HashMap<Integer, V> entity) {
        this.tableName = tableName;
        this.entity = entity;
        index = entity.size();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<V> getAll() {
        ArrayList<V> entities = new ArrayList<>();
        for (int i = 0; i < entity.size(); i++) {
            entities.add(entity.get(i));
        }
        return entities;
    }

    public void add(V object) {
        entity.put(index++, object);
    }

    public Integer search(V object) {
        for (HashMap.Entry<Integer, V> entry : entity.entrySet()) {
            if (Objects.equals(object, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void remove(V object) {
        entity.remove(search(object), object);
    }

    public V get(Integer key) {
        return entity.get(key);
    }

    public void initialization() {

    }
}
