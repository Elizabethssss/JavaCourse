package com.bank.model.repository;

import com.bank.model.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User> {

    Optional<User> findByEmail(String email);
}
