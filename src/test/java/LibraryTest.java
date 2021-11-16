import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Alias Grace", "Margaret Atwood", "Historical Fiction");
        book2 = new Book("Y: the Last Man", "Brian K. Vaughan", "Comic");
        book3 = new Book("The Sandman", "Neil Gaiman", "Comic");
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBookUnderCapacity(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void cannotAddBookOverCapacity(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

//    @Test
//    public void canTrackBooksByGenre(){
//        library.addBook(book);
//        library.addBook(book2);
//        library.addBook(book3);
//        assertEquals();
//    }
}
