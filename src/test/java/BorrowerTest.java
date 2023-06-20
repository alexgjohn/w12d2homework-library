import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BorrowerTest {

    private Borrower borrower;

    private Book book;

    private Library library;
    private ArrayList<Book> libraryBooks;

    @Before
    public void before(){
        borrower = new Borrower("Dave");
        book = new Book("Ulysses", "James Joyce", "Fiction");
        libraryBooks = new ArrayList<>();
        libraryBooks.add(book);
        libraryBooks.add(book);
        libraryBooks.add(book);
        libraryBooks.add(book);
        library = new Library("Inverleith Public Library", libraryBooks);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Dave", borrower.getName());
    }

    @Test
    public void borrowerHasBooksInPossession(){
        assertEquals(0, borrower.booksInPossessionCount());
    }

    @Test
    public void borrowerCanBorrowNewBook(){
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.booksInPossessionCount());
        assertEquals(3, library.bookCount());
    }
}
