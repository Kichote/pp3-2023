public class Ebook extends Book {
    
    private String fileName;

    public Ebook(String fileName, String title, String author) {
        super(title, author);
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
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden");
        Ebook ebook = new Ebook(book.getTitle() + ".mobi", book.getTitle(), book.getAuthor());
        Ebook ebook2 = new Ebook(book.getTitle() + ".pdf", book.getTitle(), book.getAuthor());

        System.out.println(book.display());
        System.out.println(ebook.display());
        System.out.println(ebook2.display());
    }
}
