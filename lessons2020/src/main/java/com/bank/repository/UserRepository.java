package com.bank.repository;

import com.bank.domain.User;

public interface UserRepository extends CrudRepository<User> {

    User findByEmail(String email);
}
