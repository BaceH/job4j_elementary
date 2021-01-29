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
        if (users.containsKey(user.getId())){
            return false;
        }else {
            users.put(id.incrementAndGet(), user);
            return true;
        }
    }

    public synchronized boolean update(User user){
        if (users.containsKey(user.getId())){
            users.put(user.getId(), user);
            return true;
        }else {
            return false;
        }
    }

    public synchronized boolean delete(User user){
        if (users.containsKey(user.getId())){
            users.remove(user.getId());
            return true;
        }else {
            return false;
        }
    }

    public synchronized boolean transfer(int fromId, int toId, int amount){

        if (!users.containsKey(fromId) || !users.containsKey(toId) || users.get(fromId).getAmount() < amount) {
            return false;
        } else {

            User fromUser = users.get(fromId);
            fromUser.setAmount(fromUser.getAmount() - amount);
            users.put(fromId, fromUser);

            User toUser = users.get(toId);
            toUser.setAmount(toUser.getAmount() + amount);
            users.put(toId, fromUser);

            return true;
        }
    }

}
