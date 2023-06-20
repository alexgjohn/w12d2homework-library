import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Ulysses", "James Joyce", "Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Ulysses", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("James Joyce", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
