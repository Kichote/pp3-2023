public class Audiobook extends Book {
    
    private int minutes;
    private int seconds;

    public Audiobook(String title, Writer author, Publisher publisher, int minutes, int seconds, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
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
        return "Audiobook: '" + getTitle() + "\nAuthor: {\n" + getAuthor() + " }\nPublisher: " + getPublisher() + "\nDuration: " + hours + ":" + minutesLeftFromHours + ":" + seconds;
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Grove Atlantic", "New York City");
        Publisher publisher2 = new Publisher("Harper Voyager", "New York City");
        Writer author1 = new Writer("Adam", "Mickiewicz", "Drama");
        Writer author2 = new Writer("Christie", "Golden", "Fantasy");
        Book book = new Book("World of warcraft:Przebudzenie króla lisza", author2, publisher, 2012);
        Audiobook audiobook = new Audiobook(book.getTitle(), book.getAuthor(), publisher, 238, 50, 2013);
        Audiobook audiobook2 = new Audiobook("Pan Tadeusz", author1, publisher2, 256, 15, 2001);

        System.out.println(book.display());
        System.out.println(audiobook.display());
        System.out.println(audiobook2.display());
    }
}
