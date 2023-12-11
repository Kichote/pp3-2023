public class Book {

    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;

    public Book(String title, Writer author, Publisher publisher, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public Writer getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String display() {
        return "Book: '" + title + "' \nAuthor: {\n" + author + " }\nDate of publication: " 
        + "\nPublisher: " + publisher;
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Writer author1 = new Writer("Adam", "Mickiewicz", "Drama");
        Writer author2 = new Writer("Christie", "Golden", "Fantasy");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", author2, publisher, 2012);
        Book book2 = new Book("Pan Tadeusz", author1 , publisher2, 2013);
        System.out.println(book.display());
        System.out.println(book2.display());
    }
}
