package com.bank;

import com.bank.domain.User;

public class ConsoleApplication {
    public static void main(String[] args) {
//        final User user = new User(1, "email@gmail.com", "password", null);

        final User user1 = User.builder()
                .withId(1)
                .withEmail("email@gmail.com")
                .withPassword("password")
                .withAccounts(null)
                .build();
    }
}
