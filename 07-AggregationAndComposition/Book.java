import java.util.ArrayList;

public class Book {
    
    private String title;
    private int pages;
    private Writer writer;
    private ArrayList<Chapter> chapters;

    public Book(String title, int pages, Writer writer, ArrayList<Chapter> chapters) {
        this.title = title;
        this.pages = pages;
        this.writer = writer;
        this.chapters = chapters;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public ArrayList<Chapter> getChapter() {
        return chapters;
    }

    public void setChapter(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", pages: " + pages + ", writer: " + writer + ", chapter: " + chapters + "\n";
    }
}
