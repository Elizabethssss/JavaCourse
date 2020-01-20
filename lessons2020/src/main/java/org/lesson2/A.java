package org.lesson2;

public class A {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public A(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "A{" +
                "code=" + code +
                '}';
    }
}
