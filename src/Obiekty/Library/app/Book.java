package Obiekty.Library.app;

public class Book {

    private int bookID;
    private String title;
    private String author;

    //todo w przyszlosci dodac reader
    //todo w przyszlosci dodac returnDate


    //konstruktor - wygenerowany i przerobiony na nasze potrzeby (Alt + Insert)

    private static int idCounter = 0;

    public static int getIdCounter() {
        return idCounter;
    }

    public Book() {
        bookID = 0;
        title = null;
        author = null;
    }

    public Book(String title, String author) {
        this.bookID = idCounter;
        idCounter++;

        this.title = title;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
   public String toString() {
        return "\nTitle: " + title + "\nAuthor: " + author + "\nBookID: " + bookID + "\n";
    }
}


//* modyfikatory dostępu pól i metod: private, public, (protected), <<domyślny jest dostęp pakietowy>>>