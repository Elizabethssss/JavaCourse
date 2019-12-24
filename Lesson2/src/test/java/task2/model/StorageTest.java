package task2.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StorageTest {
    private static Storage storage;
    public ArrayList<Book> temp;
    @Parameterized.Parameter
    public String given;
    @Parameterized.Parameter(1)
    public ArrayList<Book> expected;


    @Before
    public void initTests() {
        storage = new Storage();
        temp = new ArrayList<>();
    }

    @Parameterized.Parameters()
    public static Collection data() {
        return Arrays.asList(new Object[][] {
            {"", new ArrayList<>()},
            {null, new ArrayList<>()}
        });
    }

    @Test
    public void booksByAuthorNull() {
        assertEquals(storage.booksByAuthor(given), expected);
    }

    @Test
    public void booksByAuthor() {
        temp.add(new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling",
                "Bloomsbury Press", Genres.FANTASY,2007, 759, 29.67));
        assertEquals( temp.toString(), storage.booksByAuthor("J. K. Rowling").toString());
    }

    @Test
    public void booksByPublisherNull() {
        assertEquals(storage.booksByAuthor(given), expected);
    }

    @Test
    public void booksByPublisher() {
        temp.add(new Book("Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance",
                "HarperCollins", Genres.BIOGRAPHY, 2015, 416, 10.99));
        assertEquals( temp.toString(), storage.booksByPublisher("HarperCollins").toString());
    }

    @Test
    public void booksByYearNull() {
        assertEquals(storage.booksByAuthor(given), expected);
    }

    @Test
    public void booksByYear() {
        assertEquals(temp.toString(), storage.booksByYear(2019).toString());
    }

    @Test
    public void sortBooksByPublisher() {
        temp = storage.getBooks();
        storage.sortBooksByPublisher();
        assertEquals(temp, storage.getBooks());
    }
}