package com.bank.model.repository.impl;

import com.bank.model.domain.User;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class UserRepositoryImplTest {
    public UserRepositoryImpl repository;
    public User user;

    @Before
    public void init() {
        repository = new UserRepositoryImpl();
        user = User.builder()
                .withId(2)
                .withEmail("email@gmail")
                .withPassword("pass")
                .withAccounts(null)
                .build();
    }

    @Test
    public void findByEmailWithStrangeUser() {
        assertNull(repository.findByEmail(user.getEmail()));
    }


    @Test
    public void findByActualEmail() {
        assertNotNull(repository.findByEmail(repository.user1.getEmail()));
    }

    @Test
    public void save() {
        repository.save(user);
        assertNotSame(new UserRepositoryImpl().getUserIdToUser().size(), repository.getUserIdToUser().size());
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
        repository.update(repository.user1);
        assertNotSame(new UserRepositoryImpl().getUser1(), repository.getUser1());
    }

    @Test
    public void deleteById() {
        repository.deleteById(1);
        assertNull(repository.getUserIdToUser().get(1));
    }
}