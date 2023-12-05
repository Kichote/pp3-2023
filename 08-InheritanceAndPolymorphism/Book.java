public class Book {

    private String title;

    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String display() {
        return "Book: '" + title + "' \nAuthor: " + author;
    }

    public static void main(String[] args) {
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden");
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz");
        System.out.println(book.display());
        System.out.println(book2.display());
    }
}