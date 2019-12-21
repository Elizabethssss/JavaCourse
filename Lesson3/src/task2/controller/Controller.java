package task2.controller;

import task2.model.Mall;
import task2.model.Shop;
import task2.view.Util;
import task2.view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Mall mall = new Mall();
    Util util = new Util();
    Scanner scanner = new Scanner(System.in);
    int command = 0;

    public void parse(){
        while (command != 5) {
            command = checkIntInput(5,"menu");
            processMenu(command);
        }
    }

    private int checkIntInput(int n, String str) {
        String in;
        int num;
        while(true) {
            if(str.equals("menu"))
                view.printMessage(util.MENU);
            else if(str.equals("sort"))
                view.printMessage(util.PARAMETERS_MENU);
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > n) throw new Exception();
                break;
            }
            catch (Exception e) {
                view.printWrongMessage(util.WRONG_INPUT);
            }
        }
        return num;
    }

    private void processMenu(int num) {
        switch (num) {
            case 1:
                view.printMessage(mall.getShop().toString());
                view.print(mall.getShop().getDepartments());
                break;
            case 2:
                addNewDepartment();
                break;
            case 3:
                removeDepartment();
                break;
            case 4:
                int sortCommand = 0;
                while (sortCommand != 4) {
                    sortCommand = checkIntInput(4,"sort");
                    mall.sortDepartmentsBy(sortCommand);
                    view.print(mall.getShop().getDepartments());
                }
                break;
            case 5:
                break;
        }
    }

    private void addNewDepartment() {
        Shop.Department department = new Shop().new Department();
        String inp;
        String[] inputs;

        view.printMessage(util.ADD_DEP_NAME);
        inp = scanner.nextLine();
        department.setName(inp);
        view.printMessage(util.ADD_DEP_PRODUCTS);
        inp = scanner.nextLine();
        inputs = inp.split(", ");
        department.setTypesOfProduct(inputs);
        view.printMessage(util.ADD_DEP_SERVICES);
        inp = scanner.nextLine();
        inputs = inp.split(", ");
        department.setServices(inputs);
        view.printMessage(util.ADD_DEP_LOCATION);
        inp = scanner.nextLine();
        department.setLocation(inp);
        mall.addDepartment(department);
    }

    private void removeDepartment() {
        String inp;
        view.printMessage(util.DEP_TO_REMOVE);
        inp = scanner.nextLine();
        mall.removeDepartment(inp);
    }

}
