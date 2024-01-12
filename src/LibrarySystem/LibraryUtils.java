package LibrarySystem;

public class LibraryUtils {
    public static String generateBookID(String title) {
        // Generates a unique book ID based on the title
        return title.replaceAll("\\s", "_") + "_" + System.currentTimeMillis();
    }
}

