import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(100);
        book = new Book("The Sandman", "Neil Gaiman", "Comic");
        book = new Book("Alias Grace", "Margaret Atwood", "Historical Fiction");
        book = new Book("Y: the Last Man", "Brian K. Vaughan", "Comic");
    }

    @Test
    public void canBorrowLibraryBook(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        borrower.checkOutBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
    }
}
