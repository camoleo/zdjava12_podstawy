package Obiekty.Library.app;

public class Book {

    private int bookID;
    private String title;
    private String author;
    //todo w przyszlosci dodac reader
    //todo w przyszlosci dodac returnDate


    //konstruktor - wygenerowany i przerobiony na nasze potrzeby (Alt + Insert)

    private static int idCounter = 0;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;

        this.bookID = idCounter;
        idCounter++;

    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", bookId=" + bookId +
//                '}';
//    }
}




//* modyfikatory dostępu pól i metod: private, public, (protected), <<domyślny jest dostęp pakietowy>>>