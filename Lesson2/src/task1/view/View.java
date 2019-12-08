package task1.view;

import task1.controller.Controller;
import task1.model.Shape;

import java.util.Scanner;

public class View {
    Controller controller = new Controller();;
    Scanner scanner = new Scanner(System.in);
    String in = null;

    public void printSum() {
        System.out.printf("Sum = %.2f\n", controller.sumAllAreas());
        System.out.printf("Sum = %.2f\n\n", controller.sumSelectedAreas(inputType()));
    }

    private String inputType(){
        while(in == null) {
            System.out.println("Enter type (triangle, rectangle, circle):");
            in = scanner.nextLine();
            if(!in.equals("triangle") && !in.equals("rectangle") && !in.equals("circle")){
                System.out.println("Wrong input!!!");
                in = null;
            }
        }
        return in;
    }

    public void print(Shape[] shapes) {
        for (Shape sh : shapes)
            System.out.printf("%s area = %.2f\n", sh.draw(), sh.calcArea());
        System.out.println("**************************************************\n");
    }
}
