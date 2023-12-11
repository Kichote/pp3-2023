import java.util.ArrayList;

public class Bookcase {

    /*
     * 11.	Books can be placed on a bookcase. 
     * Create a class diagram. You can use the previously defined Book and Writer classes 
     * (created diagram should contain three classes). 
     * Assume that the bookcase can hold any number of books. 
     * When creating a class diagram, pay attention to the relationships between classes, 
     * taking into account that the book can exist independently of the bookcase. 
     * Mark the multiplicity in the class diagram. Then, based on the class diagram, 
     * write a program that allows books to be placed in and removed from the bookshelf. 
     * Display the bookcase contents.
    12.	Add a Chapter class to the diagram that you have created, 
    describing the chapter in a book (chapter title, number of pages, 
    starting page number). Assume that a book can contain any number of chapters. 
    What is the relationship between the book and chapters? Can a chapter exist 
    without a book? Then, modify the program for operating the bookshelf.
     */
    
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase();

        Writer writer1 = new Writer("Adam", "Mickiewicz");
        Writer writer2 = new Writer("Henryk", "Sienkiewicz");
        Writer writer3 = new Writer("dsadas", "sdadsa");

        Chapter chapter1 = new Chapter("Beggining", 0, 0);
        Chapter chapter2 = new Chapter("Journey", 0, 0);
        Chapter chapter3 = new Chapter("End", 0, 0);
        Chapter chapter4 = new Chapter("Hornets", 0, 0);
        Chapter chapter5 = new Chapter("Bob", 0, 0);
        Chapter chapter6 = new Chapter("Raid", 0, 0);
        Chapter chapter7 = new Chapter("Grand finale", 0, 0);

        ArrayList<Chapter> book1Chapters = new ArrayList<>();
        ArrayList<Chapter> book2Chapters = new ArrayList<>();
        ArrayList<Chapter> book3Chapters = new ArrayList<>();

        book1Chapters.add(chapter1);
        book1Chapters.add(chapter2);
        book1Chapters.add(chapter3);
        book2Chapters.add(chapter4);
        book2Chapters.add(chapter5);
        book3Chapters.add(chapter6);
        book3Chapters.add(chapter7);

        Book book1 = new Book("Pan Tadeusz", 455, writer1, book1Chapters );
        Book book2 = new Book("Krzyżacy", 560, writer2, book2Chapters);
        Book book3 = new Book("adsasd", 345, writer3, book3Chapters);

        bookcase.addBook(book1);
        bookcase.addBook(book2);
        bookcase.addBook(book3);

        System.out.println(bookcase.books);

        bookcase.removeBook(book3);

        System.out.println(bookcase.books);
    }
}
