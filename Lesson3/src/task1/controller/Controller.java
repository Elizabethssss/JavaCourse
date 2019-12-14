package task1.controller;

import task1.model.Playroom;
import task1.view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Playroom playroom = new Playroom();
    Scanner scanner = new Scanner(System.in);
    int command = 0;

    public void process() {
        while (command != 5) {
            command = checkIntInput(5);
            processMenu(command);
        }
    }

    private int checkIntInput(int n) {
        String in = null;
        int num = 0;
        while(in == null) {
            view.menu();
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > n) throw new Exception();
                return num;
            }
            catch (Exception e) {
                view.printWrongInput();
                in = null;
            }
        }
        return n;
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

                break;
            case 5:
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
}
