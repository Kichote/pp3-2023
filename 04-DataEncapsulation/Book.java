public class Book {
    // Attributes
    private String title;
    private int pages;

    // Accessor method for title
    public String getTitle() {
        return title;
    }

    // Modifier method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Accessor method for pages
    public int getPages() {
        return pages;
    }

    // Modifier method for pages
    public void setPages(int pages) {
        // Only modify the value if the specified number of pages is positive
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Error: Number of pages must be positive.");
        }
    }

    public static void main(String[] args) {
        // Creating a book
        Book b = new Book();

        // Using setPages method with a positive value
        b.setPages(3);

        // Using setPages method with a negative value
        b.setPages(-4);
    }
}