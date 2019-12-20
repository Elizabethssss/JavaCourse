package task1.controller;

import task1.model.*;
import task1.model.Playroom;
import task1.model.Toys;
import task1.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    View view = new View();
    Playroom<? extends Toys> playroom = new Playroom();
    Scanner scanner = new Scanner(System.in);
    int command = 0;

    public void process() {
        while (command != 6) {
            command = checkIntInput("menu");
            processMenu(command);
        }
    }

    private int checkIntInput(String str) {
        String in = null;
        int num;
        while(in == null) {
            if(str.equals("menu"))
                view.menu();
            else if(str.equals("adding"))
                view.chooseToy();
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > 6) throw new Exception();
                return num;
            }
            catch (Exception e) {
                view.printWrongInput();
                in = null;
            }
        }
        return 6;
    }

    private void processMenu(int num) {
        switch (num) {
            case 1:
                view.print(playroom.getToys());
                break;
            case 2:
                view.printMessage("Sum of all toys: " + playroom.getAllSum() + "\n");
                break;
            case 3:
                processSorting();
                break;
            case 4:
                processFiltering();
                break;
            case 5:
                processAdding();
                break;
            case 6:
                break;
            default:
                view.printWrongInput();
        }
    }

    private void processSorting() {
        String inp = "";
        while (!inp.equals("exit")) {
            view.sortMenu();
            view.printMessage("Enter value: ");
            inp = scanner.nextLine();
            if (playroom.getToys().toString().contains(inp)) {
                playroom.sortBy(inp);
                if(inp.equals("country") || inp.equals("price") || inp.equals("material"))
                    view.print(playroom.getToys());
                else
                    view.print(playroom.getTypeToys());
            }
            else if(inp.equals("exit"))
                break;
            else view.printWrongInput();
        }
    }

    private void processFiltering() {
        String inp = "";
        String[] parameters;
        while (!inp.equals("exit")) {
            filterMenu();
            view.printMessage("Enter values (write them with ', '): ");
            inp = scanner.nextLine();
            parameters = inp.split(", ");

            playroom.filterBy(parameters);
            if(playroom.getFilteredToys().size() == 0)
                view.printMessage("\u001B[31mSorry no such elements(((\u001B[0m\n");
            else if(inp.equals("exit"))
                break;
            else
                view.print(playroom.getFilteredToys());
        }
    }

    private void processAdding() {
        int num = 0;
        while (num != 6) {
            num = checkIntInput("adding");
            processAdding(num);
        }
    }

    private void processAdding(int num) {
        String[] temp;
        try {
            switch (num) {
                case 1:
                    view.addCar();
                    temp = addingToys();
                    playroom.addToy(new Car(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3]));
                    break;
                case 2:
                    view.addBarbie();
                    temp = addingToys();
                    playroom.addToy(new Barbie(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3], temp[4]));
                    break;
                case 3:
                    view.addSoftToy();
                    temp = addingToys();
                    playroom.addToy(new SoftToy(temp[0], Integer.parseInt(temp[1]), temp[2]));
                    break;
                case 4:
                    view.addConstructor();
                    temp = addingToys();
                    playroom.addToy(new Constructor(temp[0], Integer.parseInt(temp[1]), temp[2], Integer.parseInt(temp[3])));
                    break;
                case 5:
                    view.addTransformerCar();
                    temp = addingToys();
                    playroom.addToy(new TransformerCar(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3],
                            Integer.parseInt(temp[4])));
                    break;
                case 6:
                    break;
                default:
                    view.printWrongInput();
            }
        }
        catch (Exception e) {
            view.printWrongInput();
            processAdding(num);
        }
    }

    private String[] addingToys() {
        String inp;
        String[] parameters;
        inp = scanner.nextLine();
        parameters = inp.split(", ");

        return parameters;
    }

    private void filterMenu() {
        ArrayList<String> temp;
        view.printMessage("Choose parameters: ");
        view.printMessage("Countries: " + playroom.getCountries());
        view.printMessage("Materials: " + playroom.getMaterials());
        temp = playroom.getPrices();
        view.printMessage("Prices: " + temp.get(0) + " - " +
                temp.get(temp.size() - 1) + " (write 'prices x - xx')");
        view.printMessage("Colors: " + playroom.getColors());
        view.printMessage("Hair colors: " + playroom.getHairColors());
        view.printMessage("Dress colors: " + playroom.getDressColors());
        temp = playroom.getNumOfElements();
        view.printMessage("Number of elements: " + temp.get(0) + " - " +
                temp.get(temp.size() - 1) + " (write 'elements x - xx')");
        temp = playroom.getNumOfStates();
        view.printMessage("Number of states: " + temp.get(0) + " - " +
                temp.get(temp.size() - 1) + " (write 'states x - xx')");
        view.printMessage("If you want to finish type \"exit\"");
    }

}
