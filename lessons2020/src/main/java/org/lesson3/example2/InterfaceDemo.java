package org.lesson3.example2;

public class InterfaceDemo {
    public static void main(String[] args) {

        final MyInterface myInterface = new MyInterface() {
            public void method() {
                System.out.println("anonimus");
            }
        };
        MyInterface lambda = () -> System.out.println("lambda anonimus");

        myInterface.method();
        lambda.method();

        OneParameterInterface<String> oneParameterInterface = message -> System.out.println(message.isEmpty());

        TwoParameterInterface twoParameterInterface = (message, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(message);
            }
        };

    }
}
