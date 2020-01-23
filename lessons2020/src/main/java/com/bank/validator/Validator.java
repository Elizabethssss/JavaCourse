package com.bank.validator;

import com.bank.exception.ValidatorException;

public interface Validator<E> {
    void validate(E entity) throws ValidatorException;
}
