package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Process pr = new Process();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String in = null;

        while(in == null) {
            System.out.println("Enter the number[1 - 9]:");
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > 9) throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Wrong input!!!");
                in = null;
            }
        }
        pr.process(num);
    }
}
