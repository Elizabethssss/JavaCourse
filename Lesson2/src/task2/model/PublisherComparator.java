package task2.model;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        String publisher1 = b1.getPublisher();
        String publisher2 = b2.getPublisher();
        return publisher1.compareTo(publisher2);
    }
}
