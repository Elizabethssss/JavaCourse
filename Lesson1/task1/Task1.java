package task1;

import task1.converters.*;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = null;
        int input = 0;
        ConvertStrategy convert;

        while(in == null) {
            System.out.println("Enter the number:");
            in = scanner.nextLine();
            try {
                input = Integer.parseInt(in);
                if(input < 0) throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Wrong input!!!");
                in = null;
            }
        }

        convert = new ConvertTenToTwo();
        System.out.println("Binary:\n" + convert.Convert(input));
        convert = new ConvertTenToEight();
        System.out.println("Octal:\n" + convert.Convert(input));
        convert = new ConvertTenToSixteen();
        System.out.println("Hexadecimal:\n" + convert.Convert(input));
    }
}
