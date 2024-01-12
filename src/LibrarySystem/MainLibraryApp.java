package LibrarySystem;

public class MainLibraryApp {
    public static void main(String[] args) {
        LibraryInventory library =  LibraryInventory.getInstance();
        Book book1 = new Book("Do Epic Shit");
        Book book2 = new Book("Zero to One");

        library.addBook(book1);
        library.addBook(book2);

        library.displayInventory();
    }
}
