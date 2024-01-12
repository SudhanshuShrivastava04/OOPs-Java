package LibrarySystem;

public class Book {
    private String title;
    private String bookID;

    public Book(String title) {
        this.title = title;
        this.bookID = LibraryUtils.generateBookID(title);
    }

    public String getTitle() {
        return title;
    }

    public String getBookID() {
        return bookID;
    }
}
