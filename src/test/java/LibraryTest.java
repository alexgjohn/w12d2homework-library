import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    private Book book5;
    private Book book6;

    private ArrayList<Book> libraryBooks;

    @Before
    public void before(){
        book1 = new Book("Dracula", "Bram Stoker", "Horror");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
        book3 = new Book("Nineteen Eighty Four", "George Orwell", "Fiction");
        book4 = new Book("Why I Write", "George Orwell", "Non-fiction");
        book5 = new Book("The Shining", "Stephen King", "Horror");
        book6 = new Book("A Game of Thrones", "George R. R. Martin", "Fantasy");
        libraryBooks = new ArrayList<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);
        libraryBooks.add(book4);
        library = new Library("Inverleith Public Library", libraryBooks);
    }

    @Test
    public void libraryHasName(){
        assertEquals("Inverleith Public Library", library.getName());
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(4, library.bookCount());
    }

    @Test
    public void libraryCanCheckIfStockIsFull(){
        assertFalse(library.checkIfStockIsFull());
    }

    @Test
    public void libraryCanAddBookWhenNotFull(){
        library.addBook(book5);
        assertEquals(5, library.bookCount());
    }
    @Test
    public void libraryCannotAddBookWhenFull(){
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.bookCount());
    }
}
