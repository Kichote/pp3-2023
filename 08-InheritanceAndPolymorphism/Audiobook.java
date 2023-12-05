public class Audiobook extends Book {
    
    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public String display() {
        int hours = minutes/60;
        int minutesLeftFromHours = minutes%60;
        return "Audiobook: '" + getTitle() + "'\nAuthor: " + getAuthor() + "\nDuration: " + hours + ":" + minutesLeftFromHours + ":" + seconds;
    }

    public static void main(String[] args) {
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", "Christie Golden");
        Audiobook audiobook = new Audiobook(book.getTitle(), book.getAuthor(), 238, 50);
        Audiobook audiobook2 = new Audiobook("Pan Tadeusz", "Adam Mickiewicz", 256, 15);

        System.out.println(book.display());
        System.out.println(audiobook.display());
        System.out.println(audiobook2.display());
    }
}
