package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Process pr;
        Scanner scanner = new Scanner(System.in);
        String in = null;
        int num = 0;

        while(in == null) {
            System.out.println("Enter the number:");
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num <= 0) throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Wrong input!!!");
                in = null;
            }
        }
        pr = new Process(num);
        pr.print();
        pr.process();
        pr.print();
    }
}
