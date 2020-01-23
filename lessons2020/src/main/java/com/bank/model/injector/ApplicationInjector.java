package com.bank.model.injector;

import com.bank.model.domain.User;
import com.bank.model.repository.UserRepository;
import com.bank.model.repository.impl.UserRepositoryImpl;
import com.bank.model.service.PasswordEncriptor;
import com.bank.model.service.UserService;
import com.bank.model.service.impl.UserServiceImpl;
import com.bank.model.validator.UserValidator;
import com.bank.model.validator.Validator;

public class ApplicationInjector {

    private static final ApplicationInjector INSTANCE = new ApplicationInjector();

    private static final Validator<User> USER_VALIDATOR = new UserValidator();

    private static final PasswordEncriptor PASSWORD_ENCRIPTOR = new PasswordEncriptor();

    private static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();

    private static final UserService USER_SERVICE = new UserServiceImpl(USER_REPOSITORY, PASSWORD_ENCRIPTOR, USER_VALIDATOR);

    private ApplicationInjector() {
    }

    public static ApplicationInjector getInstance() {
        return INSTANCE;
    }

    public UserService getUserService(){
        return USER_SERVICE;
    }
}
