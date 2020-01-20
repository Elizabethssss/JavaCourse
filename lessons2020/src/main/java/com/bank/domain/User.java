package com.bank.domain;

import java.util.List;
import java.util.Objects;

import static com.bank.utility.CollectionUtility.nullSafeListInitialize;

public class User {
    private final Integer id;
    private final String email;
    private final String password;
    private final List<Account> accounts;

    private User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
        this.accounts = nullSafeListInitialize(builder.accounts);
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(accounts, user.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, accounts);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + "[********]" + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public static class Builder {
        private Integer id;
        private String email;
        private String password;
        private List<Account> accounts;

        private Builder() {
        }

        public User build() {
            return new User(this);
        }

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withAccounts(List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }
    }
}
