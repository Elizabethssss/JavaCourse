package task2.model;

import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private Genres genre;
    private int year;
    private int numOfPages;
    private double price;

    public Book() {}
    public Book(String name, String author, String publisher, Genres genre, int year, int numOfPages, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.year = year;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                "; author='" + author + '\'' +
                "; publisher='" + publisher + '\'' +
                "; genre='" + genre + '\'' +
                "; year=" + year +
                "; numOfPages=" + numOfPages +
                "; price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }
}
