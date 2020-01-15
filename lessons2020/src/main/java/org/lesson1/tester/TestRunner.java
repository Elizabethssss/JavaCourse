package org.lesson1.tester;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public void run(Class<?> clazz) throws Exception {
        final Constructor<?> constructor = clazz.getConstructor();
        final Object object = constructor.newInstance();
        final Method[] methods = clazz.getDeclaredMethods();
        List<Method> testMethods = getMethodsByAnnotation(Test.class, methods);
        List<Method> beforeMethods = getMethodsByAnnotation(Before.class, methods);
        List<Method> afterMethods = getMethodsByAnnotation(After.class, methods);
        List<Method> beforeAllMethods = getMethodsByAnnotation(BeforeAll.class, methods);
        List<Method> afterAllMethods = getMethodsByAnnotation(AfterAll.class, methods);
        for (Method beforeAll : beforeAllMethods ) {
            beforeAll.invoke(object);
        }
        for (Method testMethod : testMethods) {
            for (Method beforeMethod : beforeMethods) {
                beforeMethod.invoke(object);
            }
            if(!(testMethod.getAnnotation(Test.class).exceptionClass().equals(Test.None.class))){
                Class<?> ex = testMethod.getAnnotation(Test.class).exceptionClass();

                try{
                    testMethod.invoke(object);
                }catch (Exception e){
                    Class<?> clas = e.getCause().getClass();
                    if(ex != clas) {
                        System.out.println("-------------------------");
                        System.out.println("no expected Exception in "+ testMethod.getName());
                        System.out.println("expected : "+ex);
                        System.out.println("was : " + clas);
                        System.out.println("-----------------");
                    }
                }
            }
            else {
                testMethod.invoke(object);
            }

            for(Method afterMethod : afterMethods) {
                afterMethod.invoke(object);
            }
        }
        for (Method afterAll : afterAllMethods ) {
            afterAll.invoke(object);
        }
    }

    private List<Method> getMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] methods) {
        final List<Method> tempMethods = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotation)) {
                tempMethods.add(method);
            }
        }
        return tempMethods;
    }
}
