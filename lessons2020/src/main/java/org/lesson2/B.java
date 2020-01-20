package org.lesson2;

import static java.util.Objects.isNull;

public class B {
    private final String description;
    private final A a;

    public B(String description, A a) {
        this.description = description;
        this.a = copyA(a);
    }

    public String getDescription() {
        return description;
    }

    public A getA() {
        return copyA(a);
    }

    private A copyA(A a) {
        return isNull(a) ? null : new A(a.getCode());
    }

    @Override
    public String toString() {
        return "B{" +
                "description='" + description + '\'' +
                ", a=" + a +
                '}';
    }
}
