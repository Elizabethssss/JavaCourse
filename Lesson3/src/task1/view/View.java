package task1.view;

import task1.model.Toys;

import java.util.ArrayList;

public class View {

    public void print(ArrayList<Toys> toys) {
        System.out.println("******************************************************************************************");
        for (Toys toy: toys) {
            System.out.println(toy.toString());
        }
        System.out.println("******************************************************************************************");
    }

    public void menu() {
        System.out.println("Choose command:\n1. Print\n" +
                "2. Get sum of all toys\n" +
                "3. Sort toys by parameter\n" +
                "4. Filter toys by some parameters\n" +
                "5. Exit");
    }

    public void sortMenu() {
        System.out.println("Choose sorting/filtering:\nFor everyone (country, material, price)\n" +
                "For cars (color)\n" +
                "For barbies (dressColor, hairColor)\n" +
                "For soft toys ()\n" +
                "For constructors (numOfElements)\n" +
                "For transformer cars (numOfStates)\n" +
                "If you want to finish sorting type \"exit\"");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongInput() {
        System.out.println("\u001B[31mWrong input!!!\u001B[0m\n");
    }
}
