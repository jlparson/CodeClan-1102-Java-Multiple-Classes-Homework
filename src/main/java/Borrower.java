import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public void checkOutBookFromLibrary(Library library){
        Book book = library.removeBook();
        collection.add(book);
    }

    public int bookCount() {
        return this.collection.size();
    }
}
