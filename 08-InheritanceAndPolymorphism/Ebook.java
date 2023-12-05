public class Ebook extends Book {
    
    private String fileName;

    public Ebook(String fileName, String title, String author, Publisher publisher) {
        super(title, author, publisher);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String display() {
        return "Ebook: '" + getTitle() +"'\nAuthor: " + getAuthor() + "\nFile name: " + fileName;
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden", publisher);
        Ebook ebook = new Ebook(book.getTitle() + ".mobi", book.getTitle(), book.getAuthor(), publisher);
        Ebook ebook2 = new Ebook(book.getTitle() + ".pdf", book.getTitle(), book.getAuthor(), publisher2);

        System.out.println(book.display());
        System.out.println(ebook.display());
        System.out.println(ebook2.display());
    }
}
