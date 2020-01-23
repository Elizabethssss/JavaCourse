package com.bank.service.impl;

import com.bank.domain.User;
import com.bank.exception.ValidatorException;
import com.bank.repository.Page;
import com.bank.repository.UserRepository;
import com.bank.repository.impl.Pageable;
import com.bank.service.PasswordEncriptor;
import com.bank.service.UserService;
import com.bank.validator.Validator;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static final int USER_PER_PAGE = 5;

    private final UserRepository userRepository;
    private final PasswordEncriptor passwordEncriptor;
    private final Validator<User> userValidator;

    public UserServiceImpl(UserRepository userRepository, PasswordEncriptor passwordEncriptor,
                           Validator<User> userValidator) {
        this.userRepository = userRepository;
        this.passwordEncriptor = passwordEncriptor;
        this.userValidator = userValidator;
    }

    @Override
    public boolean login(String email, String password) {
        String encryptedPassword = PasswordEncriptor.encrypt(password);

        return userRepository.findByEmail(email)
                .map(User::getPassword)
                .filter(pass -> pass.equals(encryptedPassword))
                .isPresent();
    }

    @Override
    public boolean register(User user) {
        try {
            userValidator.validate(user);
            user.setPassword(PasswordEncriptor.encrypt(user.getPassword()));
            userRepository.save(user);
            return true;
        } catch (ValidatorException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public List<User> findAll(int page) {
        final Pageable<User> users = userRepository.findAll(new Page(page, USER_PER_PAGE));
        return null;
    }
}