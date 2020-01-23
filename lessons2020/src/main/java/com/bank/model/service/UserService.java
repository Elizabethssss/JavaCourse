package com.bank.model.service;

import com.bank.model.domain.User;

import java.util.List;

public interface UserService {

    boolean login(String email, String password);

    boolean register(User user);

    List<User> findAll(int page);
}