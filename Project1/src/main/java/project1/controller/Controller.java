package project1.controller;

import project1.model.*;
import project1.model.ammunition.*;
import project1.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    View view = new View();
    AmmoStorage storage;
    Knight knight;
    int equipCommand, menuCommand;

    // choosing equipment and dressing knight
    public void process() {
        do {
            equipCommand = checkIntInput(7, "equip");
            dressKnight(equipCommand);
        } while (equipCommand != 7);
    }

    // prints all available equipment
    private void chooseEquipment() {
        storage = new AmmoStorage();
        view.printMessage("Choose equipment:\n1. ");
        view.print(storage.getKit1());
        view.printMessage("2. ");
        view.print(storage.getKit2());
        view.printMessage("3. ");
        view.print(storage.getKit3());
        view.printMessage("4. ");
        view.print(storage.getKit4());
        view.printMessage("5. ");
        view.print(storage.getKit5());
        view.printMessage("6. ");
        view.print(storage.getKit6());
        view.printMessage("7. Exit");
    }

    // Choosing actions
    private void processEquipment() {
        menuCommand = 0;
        do {
            menuCommand = checkIntInput(4, "menu");
            processMenu(menuCommand);
        } while (menuCommand != 4);

    }

    // dress knight by chosen equipment
    private void dressKnight(int num) {
        switch (num) {
            case 1:
                knight = new Knight(storage.getKit1());
                break;
            case 2:
                knight = new Knight(storage.getKit2());
                break;
            case 3:
                knight = new Knight(storage.getKit3());
                break;
            case 4:
                knight = new Knight(storage.getKit4());
                break;
            case 5:
                knight = new Knight(storage.getKit5());
                break;
            case 6:
                knight = new Knight(storage.getKit6());
                break;
            case 7:
                return;
        }
        processEquipment();
    }

    // Handles actions with equipment
    private void processMenu(int command) {
        switch (command) {
            case 1:
                view.printMessage("\u001B[33mSum of your kit: " + knight.sumAll() + "\u001B[0m\n");
                break;
            case 2:
                knight.sortByWeight();
                view.print(knight.getKit());
                break;
            case 3:
                checkFilterInput();
                view.print(knight.getFilteredKit());
                break;
            case 4:
                break;
        }
    }

    // checking int input by given menu
    private int checkIntInput(int n, String str) {
        String in = null;
        int num;
        while (in == null) {
            if (str.equals("equip"))
                chooseEquipment();
            else if (str.equals("menu"))
                view.menu();
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if (num < 1 || num > n) throw new Exception();
                return num;
            } catch (Exception e) {
                view.printWrongInput();
                in = null;
            }
        }
        return n;
    }

    // checking input for filtering equipment by range
    private void checkFilterInput() {
        String inp = "";
        String[] strings;
        int[] parameters = new int[2];

        knight.sortByPrice();
        ArrayList<Ammunition> temp = knight.getKit();
        while (true) {
            view.printMessage("Prices: " + temp.get(0).getPrice() + " - " + temp.get(temp.size() - 1).getPrice());
            view.printMessage("Enter price range (x - xx): ");
            inp = scanner.nextLine();
            strings = inp.split(" - ");
            try {
                for (int i = 0; i < strings.length; i++)
                    parameters[i] = Integer.parseInt(strings[i]);
                knight.filterByPrice(parameters);
                if(knight.getFilteredKit().size() == 0) {
                    view.printMessage("\u001B[31mSorry no such elements(((\u001B[0m\n");
                    continue;
                }
                break;
            } catch (Exception e) {
                view.printWrongInput();
            }
        }
    }
}
