package org.lesson1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //final A a = new A();
        final Class<A> aClass = A.class;
        final Constructor<A> constructor = aClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        final A a = constructor.newInstance(1);
        //a.method();
        final Method method = aClass.getDeclaredMethod("method");
        method.setAccessible(true);
        final Object invoke = method.invoke(a);
        System.out.println(invoke);
//        A.staticMethod();
        final Method method2 = aClass.getDeclaredMethod("staticMethod");
        method2.setAccessible(true);
        final Object invoke2 = method2.invoke(null);
    }
}

class A {

    private A(int i) {
        System.out.println(i);
    }

    private void method() {
        System.out.println("Non-static method");
    }

    private static void staticMethod() {
        System.out.println("Static method");
    }

}
