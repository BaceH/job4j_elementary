package ru.job4j.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private final Map<Integer, Base> memory = new ConcurrentHashMap<>();

    public boolean add(Base model) {
        return memory.putIfAbsent(model.getId(), model) == null;
    }

    public boolean update(Base model) {
        Base stored = memory.get(model.getId());
        if (stored.getVersion() != model.getVersion() && memory.putIfAbsent(model.getId(), model) != null) {
            throw new OptimisticException("Versions are not equal");
        }
        return true;
    }

    public void delete(Base model) {
        memory.remove(model.getId());
    }
    public Base get(int index) {
        return memory.get(index);
    }
}
