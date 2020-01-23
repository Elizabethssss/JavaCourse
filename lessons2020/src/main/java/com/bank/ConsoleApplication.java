package com.bank;

import com.bank.injector.ApplicationInjector;
import com.bank.service.UserService;

import java.util.Arrays;
import java.util.List;

public class ConsoleApplication {
    public static void main(String[] args) throws Exception {
        ApplicationInjector injector = ApplicationInjector.getInstance();
        final UserService userService = injector.getUserService();
        final boolean password = userService.login("alex@gmail.com", "password");
        System.out.println(password);

        List<String> list = Arrays.asList("one", "three", "five", "123456789");
        final Integer integer = list.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(integer);
    }
}
