public class Ebook extends Book {
    
    private String fileName;

    public Ebook(String fileName, String title, Writer author, Publisher publisher, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String display() {
        return "Ebook: '" + getTitle() + "\nAuthor: {\n" + getAuthor() + " }\nFile name: " + fileName + "\nPublisher: " + getPublisher();
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Writer author = new Writer("Christie", "Golden", "Fantasy");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", author, publisher, 2012);
        Ebook ebook = new Ebook(book.getTitle() + ".mobi", book.getTitle(), book.getAuthor(), publisher, 2013);
        Ebook ebook2 = new Ebook(book.getTitle() + ".pdf", book.getTitle(), book.getAuthor(), publisher2, 2009);

        System.out.println(book.display());
        System.out.println(ebook.display());
        System.out.println(ebook2.display());
    }
} 
