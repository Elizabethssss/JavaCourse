package task2.controller;

import task2.model.Book;
import task2.model.Genres;
import task2.view.View;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileController {
    View view = new View();
    ArrayList<Book> newBooks = new ArrayList<>();
    Matcher matcher;
    Pattern pattern;

    public ArrayList<Book> getNewBooks() {
        return newBooks;
    }

    boolean checkInput(String input) {
        if(input.contains(".txt"))
            return true;
        view.printWrongInput();
        return false;
    }

    public void saveToFile(String fileName, ArrayList<Book> books) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Book book : books)
                writer.write(book.toString() + "\n");

            writer.close();
        }
        catch (IOException e) {
            view.printWrongInput();
        }
    }

    public void readFromFile(String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            Book book = new Book();
            String readLine;
            String[] arguments;
            while ((readLine = in.readLine()) != null) {
                if (readLine.contains("Book{")) {
                    arguments = readLine.split("; ");
                    book = new Book();
                    for (String arg : arguments) {
                        String temp = "";
                        if (arg.contains("'"))
                            temp = checkString(arg);
                        if (arg.contains("name"))
                            book.setName(temp);
                        else if (arg.contains("author"))
                            book.setAuthor(temp);
                        else if (arg.contains("publisher"))
                            book.setPublisher(temp);
                        else if (arg.contains("genre"))
                            book.setGenre(Genres.valueOf(temp.toUpperCase()));
                        else if (arg.contains("year"))
                            book.setYear((int) checkInteger(arg));
                        else if (arg.contains("numOfPages"))
                            book.setNumOfPages((int) checkInteger(arg));
                        else if (arg.contains("price"))
                            book.setPrice(checkInteger(arg));
                    }
                }
                newBooks.add(book);
            }
        } catch (IOException e) {
            view.printWrongInput();
        }
    }

    private String checkString(String str) {
        pattern = Pattern.compile("'.*'");
        matcher = pattern.matcher(str);
        if(matcher.find())
            return matcher.group().substring(1, matcher.group().length()-1);
        return "";
    }

    private double checkInteger(String str) {
        String[] temp = str.split("=");
        pattern = Pattern.compile("\\d+(\\.\\d+)?");
        if(temp[1].contains("}"))
            temp[1] = temp[1].substring(0, temp[1].length()-1);
        matcher = pattern.matcher(temp[1]);
        if(matcher.matches())
            return Double.parseDouble(matcher.group());
        return 0;
    }
}
