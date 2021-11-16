import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Alias Grace", "Margaret Atwood", "Historical Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Alias Grace", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Margaret Atwood", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Historical Fiction", book.getGenre());
    }

}
