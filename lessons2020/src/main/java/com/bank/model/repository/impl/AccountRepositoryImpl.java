package com.bank.model.repository.impl;

import com.bank.model.domain.Account;
import com.bank.model.domain.User;
import com.bank.model.repository.AccountRepository;
import com.bank.model.repository.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {
    private final Map<Integer, Account> map = new HashMap<>();
    Account account;
    User user;

    //
    @Override
    public void save(Account entity) {
        map.put(entity.getId(), entity);
    }

    @Override
    public Account findById(Integer id) {
        return map.get(id);
    }

    @Override
    public List<Account> findAll(int page, int itemsPerPage) {
        return null;
    }

    @Override
    public Pageable<Account> findAll(Page page) {
        return null;
    }

    @Override
    public void update(Account entity) {
        map.replace(entity.getId(), entity);
    }

    @Override
    public void deleteById(Integer id) {
        map.remove(id);
    }

    public AccountRepositoryImpl() {
        this.user = User.builder()
                .withId(2)
                .withEmail("email@gmail")
                .withPassword("pass")
                .withAccounts(null)
                .build();
        this.account = new Account(1, this.user, 12345);
        map.put(account.getId(), account);
    }

    public Map<Integer, Account> getMap() {
        return map;
    }

    public Account getAccount() {
        return account;
    }

    public User getUser() {
        return user;
    }
}
