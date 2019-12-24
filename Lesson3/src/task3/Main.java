package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EnumExample mon = EnumExample.MONDAY;
        EnumExample fri = EnumExample.FRIDAY;

        System.out.println(mon);
        System.out.println(fri);

        System.out.println(Arrays.toString(EnumExample.values()));
        System.out.println(EnumExample.valueOf("WEDNESDAY").getOrdinal());
        System.out.println(EnumExample.valueOf(mon.toString()).getOrdinal());
    }
}
