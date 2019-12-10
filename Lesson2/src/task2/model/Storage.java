package task2.model;

import task1.model.AreaComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Storage {
    ArrayList<Book> books = new ArrayList<>();

    public Storage() {
        books.add(new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling",
                "Bloomsbury Press", 2007, 759, 29.67));
        books.add(new Book("Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance",
                "HarperCollins", 2015, 416, 10.99));
        books.add(new Book("Steve Jobs: The Man Who Thought Different: A Biography", "Karen Blumenthal",
                "Square Fish", 2012, 320, 7.99));
        books.add(new Book("Maybe You Should Talk to Someone", "Lori Gottlieb",
                "Houghton Mifflin Harcourt", 2019, 432, 13.99));
        books.add(new Book("Wrecking Ball", "Jeff Kinney", "Harry N. Abrams",
                2019, 224, 8.99));
        books.add(new Book("Becoming", "Michelle Obama", "Crown Publishing Group",
                2018, 448, 11.89));
        books.add(new Book("Educated: A Memoir", "Tara Westover", "Random House",
                2018, 352, 13.99));
        books.add(new Book("Binging with Babish: 100 Recipes", "Andrew Rea",
                "Houghton Mifflin Harcourt", 2019, 336, 17.99));
        books.add(new Book("Nothing Fancy: Unfussy Food for Having People Over", "Alison Roman",
                "Clarkson Potter", 2019, 320, 29.25));
        books.add(new Book("The Body: A Guide for Occupants", "Bill Bryson", "Doubleday",
                2019, 464, 13.39));
        books.add(new Book("How To: Absurd Scientific Advice for Common Real-World Problems", "Randall Munroe",
                "Riverhead Books", 2019, 320, 16.69));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> booksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books)
            if (book.getAuthor().equals(author))
                result.add(book);
        return result;
    }

    public ArrayList<Book> booksByPublisher(String publisher) {
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books)
            if (book.getPublisher().equals(publisher))
                result.add(book);
        return result;
    }

    public ArrayList<Book> booksByYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books)
            if (book.getYear() > year)
                result.add(book);
        return result;
    }

    public void sortBooksByPublisher() {
        books.sort(new PublisherComparator());
    }
}
