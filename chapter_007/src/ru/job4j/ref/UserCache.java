package ru.job4j.ref;

import net.jcip.annotations.NotThreadSafe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@NotThreadSafe
public class UserCache {
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();
    private final AtomicInteger id = new AtomicInteger();

    public void add(User user) {
        users.put(id.incrementAndGet(), User.of(user.getName()));
    }

    public User findById(int id) {
        return User.of(users.get(id).getName());
    }

    public List<User> findAll() {
        List<User> listUser = new ArrayList<User>();
        users.values().stream().forEach(u -> listUser.add(User.of(u.getName())));

        return listUser;
    }
}