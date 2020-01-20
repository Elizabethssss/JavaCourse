package com.bank.domain;

public class Account {
    private final Integer id;
    private final User user;
    private final Integer money;

    public Account(Integer id, User user, Integer money) {
        this.id = id;
        this.user = user;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
