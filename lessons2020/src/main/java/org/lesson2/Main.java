package org.lesson2;

public class Main {
    public static void main(String[] args) {
        A a = new A(100);

        final B b = new B("Description", a);
        System.out.println(b);

        a.setCode(200);

        System.out.println(b);

        final A a1 = b.getA();
        a1.setCode(300);
        System.out.println(b);
    }
}
