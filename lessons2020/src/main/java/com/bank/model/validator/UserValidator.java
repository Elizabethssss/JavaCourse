package com.bank.model.validator;

import com.bank.model.domain.User;
import com.bank.model.exception.ValidatorException;

import java.util.function.Function;
import java.util.regex.Pattern;

public class UserValidator implements Validator<User> {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_!#$%&*+/=?`{}~^.-]+@[a-zA-Z0-9.-]+$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
    private static final Pattern TELEPHONE_PATTERN = Pattern.compile("([+]*38[(]?[0-9]{1,4}[)]?[-\\s./0-9]*)");

    @Override
    public void validate(User user) throws ValidatorException {
        if (user == null) {
            throw new ValidatorException("");
        }
        validateEmail(user);
        validatePassword(user);
        validateString(TELEPHONE_PATTERN, user, User::getTelephoneNumber, "Telephone do not match the pattern");
    }

    private static void validateEmail(User user) throws ValidatorException {
        validateString(EMAIL_PATTERN, user, User::getEmail, "Email do not match the pattern");
    }

    private static void validatePassword(User user) throws ValidatorException {
        validateString(PASSWORD_PATTERN, user, User::getPassword, "Password do not match the pattern");
    }

    private static void validateString(Pattern pattern, User user, Function<User, String> function,
                                       String exceptionMessage) throws ValidatorException {
        if (!pattern.matcher(function.apply(user)).matches()) {
            throw new ValidatorException(exceptionMessage);
        }
    }
}
