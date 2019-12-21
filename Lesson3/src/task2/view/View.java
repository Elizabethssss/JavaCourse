package task2.view;

import task1.model.Toys;
import task2.model.Shop;

import java.util.ArrayList;

public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongMessage(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m\n");
    }

    public void print(ArrayList<Shop.Department> departments) {
        System.out.println("******************************************************************************************");
        for (Shop.Department department : departments) {
            System.out.println(department.toString());
        }
        System.out.println("******************************************************************************************");
    }
}
