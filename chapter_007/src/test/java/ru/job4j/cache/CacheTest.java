package ru.job4j.cache;


import org.junit.Test;

import static org.junit.Assert.*;

public class CacheTest {

    @Test
    public void add() {
        Cache memory = new Cache();
        Base base = new Base(1,1);
        base.setName("base 1");
        memory.add(base);

        assertEquals(memory.get(base.getId()).getName() , base.getName());
    }

    @Test
    public void update() {
        Cache memory = new Cache();
        Base base = new Base(1,1);
        base.setName("base 1");
        memory.add(base);

        Base user1 = memory.get(base.getId());
        user1.setName("User 1");

        memory.update(user1);

        assertEquals(memory.get(base.getId()).getName() , "User 1");
    }

    @Test
    public void delete() {
        Cache memory = new Cache();
        Base base = new Base(1,1);
        base.setName("base 1");
        memory.add(base);
        memory.delete(base);
        assertNull(memory.get(base.getId()));
    }
}
