package com.bank.repository.impl;

import com.bank.domain.User;
import com.bank.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> userIdToUser = new HashMap<>();
    final User user1 = User.builder()
            .withId(1)
            .withEmail("email@gmail.com")
            .withPassword("password")
            .withAccounts(null)
            .build();


    @Override
    public User findByEmail(String email) {
        for (Map.Entry<Integer, User> integerUserEntry : userIdToUser.entrySet()) {
            User temp = integerUserEntry.getValue();
            if (temp.getEmail().equals(email))
                return temp;
        }
        return null;
    }

    @Override
    public void save(User entity) {
        int id = entity.getId();
        userIdToUser.put(id, entity);
    }

    @Override
    public User findById(Integer id) {
        return userIdToUser.get(id);
    }

    @Override
    public List<User> findAll() {
        List<User> result = new ArrayList<>();
        userIdToUser.forEach((k, v) -> result.add(v));
        return result;
    }

    @Override
    public void update(User entity) {
        userIdToUser.replace(entity.getId(), entity);
    }

    @Override
    public void deleteById(Integer id) {
        userIdToUser.remove(id);
    }

    public UserRepositoryImpl() {
        userIdToUser.put(1, user1);
    }

    public User getUser1() {
        return user1;
    }

    public Map<Integer, User> getUserIdToUser() {
        return userIdToUser;
    }
}
