public class Book {

    private String title;
    private String author;
    private Publisher publisher;

    public Book(String title, String author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String display() {
        return "Book: '" + title + "' \nAuthor: " + author + "\nPublisher: " + publisher.getName() + ", " + publisher.getCity();
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden", publisher);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", publisher2);
        System.out.println(book.display());
        System.out.println(book2.display());
    }
}