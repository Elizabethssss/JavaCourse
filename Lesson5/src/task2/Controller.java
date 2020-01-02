package task2;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    int N, from, to;

    void process() {
        System.out.println("Enter N: ");
        N = checkIntInput();
        System.out.println("Enter number from: ");
        from = checkIntInput();
        System.out.println("Enter number to: ");
        to = checkIntInput();
        try {
            if (to < from)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("'to' must be greater than 'from'");
            process();
        }
        Generator generator = new Generator(N, from, to);
        System.out.println(generator.getList().toString());
        for(Number n : generator.getSet())
            System.out.printf("%.2f, ", n);

    }

    int checkIntInput() {
        String in;
        int num;
        while(true) {
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 0) throw new Exception();
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong input!!!");
            }
        }
        return num;
    }

}
