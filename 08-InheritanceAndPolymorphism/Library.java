import java.util.ArrayList;

public class Library {
    
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden");

        Ebook ebook = new Ebook(book.getTitle() + ".mobi", book.getTitle(), book.getAuthor());
        Ebook ebook2 = new Ebook(book.getTitle() + ".pdf", book.getTitle(), book.getAuthor());

        Audiobook audiobook = new Audiobook(book.getTitle(), book.getAuthor(), 238, 50);
        Audiobook audiobook2 = new Audiobook("Pan Tadeusz", "Adam Mickiewicz", 256, 15);

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
