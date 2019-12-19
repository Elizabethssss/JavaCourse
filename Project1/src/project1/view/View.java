package project1.view;

import project1.model.ammunition.Ammunition;

import java.util.ArrayList;

public class View {

    public void print(ArrayList<Ammunition> ammo) {
        System.out.println("******************************************************************************************");
        for (Ammunition ammunition : ammo) {
            System.out.println(ammunition.toString());
        }
        System.out.println("******************************************************************************************");
    }

    public void menu() {
        System.out.println("Choose command:\n" +
                "1. Get sum of all ammunition\n" +
                "2. Sort ammunition by weight\n" +
                "3. Filter ammunition by price range\n" +
                "4. Exit");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongInput() {
        System.out.println("\u001B[31mWrong input!!!\u001B[0m\n");
    }
}
