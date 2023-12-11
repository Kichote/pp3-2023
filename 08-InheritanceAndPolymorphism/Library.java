import java.util.ArrayList;

public class Library {
    
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Writer author1 = new Writer("Adam", "Mickiewicz", "Drama");
        Writer author2 = new Writer("Christie", "Golden", "Fantasy");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", author2, publisher, 2012);

        Ebook ebook = new Ebook(book.getTitle() + ".mobi", book.getTitle(), book.getAuthor(), publisher, 2013);
        Ebook ebook2 = new Ebook(book.getTitle() + ".pdf", book.getTitle(), book.getAuthor(), publisher2, 2009);

        Audiobook audiobook = new Audiobook(book.getTitle(), book.getAuthor(), publisher,238, 50, 2001);
        Audiobook audiobook2 = new Audiobook("Pan Tadeusz", author1, publisher2,256, 15, 2001);

        books.add(book);
        books.add(ebook);
        books.add(ebook2);
        books.add(audiobook);
        books.add(audiobook2);

        for(Book b : books) {
            System.out.println(b.display());
        }
    }

}