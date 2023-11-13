public class C6 {
    // Attributes
    private String title;
    private int pages;

    // Getter and Setter methods for the "title" attribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for the "pages" attribute
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        // Check if the specified number of book pages is positive before modifying the attribute
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public static void main(String[] args) {
        // Sample usage
        C6 book = new C6();

        // Set the number of pages to 3
        book.setPages(3);
        System.out.println("Pages after setting to 3: " + book.getPages());

        // Attempt to set the number of pages to -4
        book.setPages(-4);
        System.out.println("Pages after attempting to set to -4: " + book.getPages());
    }
}