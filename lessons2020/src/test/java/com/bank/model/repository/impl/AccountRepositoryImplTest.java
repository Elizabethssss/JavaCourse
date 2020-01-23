package com.bank.model.repository.impl;

import com.bank.model.domain.Account;
import com.bank.model.domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountRepositoryImplTest {
    public AccountRepositoryImpl repository;
    public Account account;

    @Before
    public void init() {
        repository = new AccountRepositoryImpl();
        account = new Account(2, User.builder().build(), 222);
    }

    @Test
    public void save() {
        repository.save(account);
        assertNotSame(new AccountRepositoryImpl().getMap().size(), repository.getMap().size());
    }

    @Test
    public void findByActualId() {
        assertNotNull(repository.findById(1));
    }

    @Test
    public void findByStrangeId() {
        assertNull(repository.findById(13456));
    }

    @Test
    public void update() {
        repository.update(repository.account);
        assertNotSame(new AccountRepositoryImpl().getAccount(), repository.getAccount());
    }

    @Test
    public void deleteById() {
        repository.deleteById(1);
        assertNull(repository.getMap().get(1));
    }
}