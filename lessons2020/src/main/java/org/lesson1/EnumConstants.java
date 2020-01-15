package org.lesson1;

import java.util.Arrays;

public class EnumConstants {
    public static void main(String[] args) {
        Class<?> myClass = Dates.class;
        System.out.println("Enum name: " + myClass.getName());
        System.out.println("Enum constants: " + Arrays.asList(myClass.getEnumConstants()));
    }
}

enum Dates {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


