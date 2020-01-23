package com.bank.model.validator;

import com.bank.model.exception.ValidatorException;

public interface Validator<E> {
    void validate(E entity) throws ValidatorException;
}
