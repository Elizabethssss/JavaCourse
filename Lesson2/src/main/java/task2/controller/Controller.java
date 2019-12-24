package task2.controller;

import task2.model.Book;
import task2.model.Storage;
import task2.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner;
    View view = new View();
    Storage storage = new Storage();
    ArrayList<Book> result = new ArrayList<>();

    public void process() {
        scanner = new Scanner(System.in);
        int menuNumber = 0;
        while (menuNumber != 6) {
            view.menu();
            menuNumber = scanner.nextInt();
            processMenu(menuNumber);
        }
    }

    private void processMenu(int num) {
        scanner = new Scanner(System.in);
        switch (num) {
            case 1:
                view.print(storage.getBooks());
                break;
            case 2:
                view.askForValue();
                result = storage.booksByAuthor(scanner.nextLine());
                if(result.size() == 0)
                    view.printNoResult();
                view.print(result);
                break;
            case 3:
                view.askForValue();
                result = storage.booksByPublisher(scanner.nextLine());
                if(result.size() == 0)
                    view.printNoResult();
                view.print(result);
                break;
            case 4:
                view.askForValue();
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
                break;
            default:
                view.printWrongInput();
        }
    }
}
