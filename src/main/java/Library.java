import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.book = new ArrayList<>();
    }

    public void addBook(Book book){
        if(this.capacity > this.bookCount()){
        this.book.add(book);
        }
    }

    public int bookCount(){
        return this.book.size();
    }

    public Book removeBook(){
        return this.book.remove(0);
    }


}
