package ru.job4j.storage;

import net.jcip.annotations.ThreadSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@ThreadSafe
public class UserStorage {

    private final Map<Integer,User> users = new HashMap<>();
    private final AtomicInteger id = new AtomicInteger();

    public boolean add (User user){
        return users.putIfAbsent(id.incrementAndGet(), user) == null;
    }

    public synchronized boolean update(User user){
        return users.replace(user.getId(), user) == null;
    }

    public synchronized boolean delete(User user){
        return users.remove(user.getId(), user);
    }

    public synchronized boolean transfer(int fromId, int toId, int amount){

        if (!users.containsKey(fromId) || !users.containsKey(toId) || users.get(fromId).getAmount() < amount) {
            return false;
        }

        User fromUser = users.get(fromId);
        fromUser.setAmount(fromUser.getAmount() - amount);
        users.put(fromId, fromUser);

        User toUser = users.get(toId);
        toUser.setAmount(toUser.getAmount() + amount);
        users.put(toId, fromUser);

        return true;

    }

}
