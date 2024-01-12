package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryInventory {
    private  static  LibraryInventory instance;
    private List<Book> books;

    public LibraryInventory() {
        books = new ArrayList<>();
    }
// singleton class
    public static LibraryInventory getInstance() {
        if (instance == null){
            instance = new LibraryInventory();
        }
        return instance;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayInventory(){
        System.out.println("Library Inventory:");
        for (Book book: books){
            System.out.println("Book ID: " + book.getBookID() + ", Title: " + book.getTitle());
        }
    }
}
