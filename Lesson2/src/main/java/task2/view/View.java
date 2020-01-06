package task2.view;

import task2.model.Book;

import java.util.ArrayList;

public class View {

    public void menu() {
        System.out.println("Choose command:\n1. Print all\n" +
                "2. Get list of books by author\n" +
                "3. Get list of books by publisher\n" +
                "4. Get list of books published after given year\n" +
                "5. Sort books by publishers\n" +
                "6. Save to file\n" +
                "7. Exit");
    }

    public void enterMenu() {
        System.out.println("Choose source:\n1. From file\n" +
                "2. From data base");
    }

    public void printWrongInput() {
        System.out.println("Wrong input!!!\n");
    }

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printNoResult() {
        System.out.print("No result(\n");
    }

    public void print(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println();

    }
}
