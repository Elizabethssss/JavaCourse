package task2.controller;

import task2.model.Book;
import task2.model.Storage;
import task2.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    View view = new View();
    Storage storage = new Storage();
    FileController fileController = new FileController();
    ArrayList<Book> result = new ArrayList<>();
    int command = 0, enter = 0;

    public void process() {
//        while (enter != 2) {
            enter = checkIntInput(2, "enter");
            processEnter(enter);
//        }
        while (command != 7) {
            command = checkIntInput(7, "menu");
            processMenu(command);
        }
    }

    private int checkIntInput(int n, String str) {
        String in;
        int num;
        while(true) {
            if(str.equals("menu"))
                view.menu();
            else if(str.equals("enter"))
                view.enterMenu();
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if(num < 1 || num > n) throw new Exception();
                break;
            }
            catch (Exception e) {
                view.printWrongInput();
            }
        }
        return num;
    }

    private void processEnter(int num) {
        switch (num) {
            case 1:
                storage.clearAllBooks();
                fileController.readFromFile("123.txt");
//                fileController.readFromFile(checkFileInput());
                storage.setBooks(fileController.getNewBooks());
                break;
            case 2:
                break;
            default:
                view.printWrongInput();
        }
    }

    private void processMenu(int num) {
        scanner = new Scanner(System.in);
        switch (num) {
            case 1:
                view.print(storage.getBooks());
                break;
            case 2:
                view.printMessage("Enter value: ");
                result = storage.booksByAuthor(scanner.nextLine());
                if(result.size() == 0)
                    view.printNoResult();
                view.print(result);
                break;
            case 3:
                view.printMessage("Enter value: ");
                result = storage.booksByPublisher(scanner.nextLine());
                if(result.size() == 0)
                    view.printNoResult();
                view.print(result);
                break;
            case 4:
                view.printMessage("Enter value: ");
                result = storage.booksByYear(scanner.nextInt());
                if(result.size() == 0)
                    view.printNoResult();
                view.print(result);
                break;
            case 5:
                storage.sortBooksByPublisher();
                view.print(storage.getBooks());
                break;
            case 6:

                fileController.saveToFile(checkFileInput(), storage.getBooks());
                break;
            case 7:
                break;
            default:
                view.printWrongInput();
        }
    }

    private String checkFileInput() {
        String input;
        do {
            view.printMessage("Enter the name of file: ");
            input = scanner.nextLine();
        } while (!fileController.checkInput(input));
        return input;
    }

}
