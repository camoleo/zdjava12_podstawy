package Obiekty.Library.app;
//Zaimplementuj program konsolowy "Biblioteka", który będzie obsługiwał następujące przypadki użycia.
//        * Bibliotekarz może dodać książkę do zbioru
//        * Bibliotekarz może usunąć książkę ze zbioru
//        * Bibliotekarz może wyświetlić listę wszystkich książek w bibliotece
//        * Bibliotekarz może wyszukać książkę po tytule lub autorze

//        * Bibliotekarz może zarejestrować czytelnika
//        * Bibliotekarz może "zarezerować" książkę dla czytelnika
//        * Bibliotekarz może "wypożyczyć" książkę dla czytelnika

//        * Bibliotekarz może wyświetlić wypożyczenia i rezerwacje czytelnika
//        * Bibliotekarz może oznaczyć, że książka została oddana przez czytelnika

import java.util.Scanner;


public class Library {

    private Book[] books;
    private Reader[] readers;
    private int firstEmptyBookIndex;
    private int firstEmptyReaderIndex;

    //konstruktor - pusta tablica, do ktorej bedziemy wrzucac te ksiazki

    private static final int MAX_BOOKS_COUNT = 100;
    private static final int MAX_READERS_COUNT = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyBookIndex = 0;
        this.readers = new Reader[MAX_READERS_COUNT];
        this.firstEmptyReaderIndex = 0;
    }

    //View a book list
    public void printBooks() {
        for (Book book : books) {
            if (book == null) {

            } else {
                System.out.println(book);
            }
        }
    }

    //Add a new book
    public void addBook(Book book) {
        //Book ID
        this.books[firstEmptyBookIndex] = book;
        firstEmptyBookIndex++;
    }

    public void addBook() {
        //author
        Book newBook = new Book();
        System.out.println("Enter the author name: ");
        Scanner authorInput = new Scanner(System.in);
        String author = authorInput.nextLine();
        newBook.setAuthor(author);
        //title
        System.out.println("Enter the book title: ");
        Scanner titleInput = new Scanner(System.in);
        String title = titleInput.nextLine();
        newBook.setTitle(title);
    }

    //View readers list
    public void printReaders() {
        System.out.println("Reader Name\t\tReaderID");
        for (int i=0; i<firstEmptyReaderIndex; i++){

            System.out.println(readers[i].getReaderName() + "\t\t\t\t\t\t\t" + readers[i].getReaderId());

        }

//        for (Reader reader : readers) {
//            if (reader == null) {
//
//            } else {
//                System.out.println(reader);
//            }
//        }
    }

    //Register a new reader
    public void addReader(Reader reader) {
        //Reader ID
        this.readers[firstEmptyReaderIndex] = reader;
        firstEmptyReaderIndex++;
    }


    public void addReader() {
        Reader newReader = new Reader();
        System.out.println("Enter the reader name: ");
        Scanner readerScanner = new Scanner(System.in);
        String reader = readerScanner.nextLine();
        newReader.setReaderName(reader);

    }

//Remove a book
    public void removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bookID to remove: ");
        int bookID = scanner.nextInt();

        for (int i = 0; i < books.length; i++) {
            if (bookID == i) {
                books[i] = null;
            }
        }

    }
//Search a book by title
//    public void findByTitle(String title) {
//        Book book = findByTitle(title);
//        if (book != null) {
//            // Print the book info
//        } else {
//            System.out.println("No Book for Serial No " + sNo + " Found.");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What book are you searching?: ");
//        String bookName = scanner.nextLine();
//        int counter = 0;
//        for (int i = 0; i < counter; i++) {
//
//            if (bookName.equalsIgnoreCase(books[i].getTitle())) {
//
//                System.out.println(books[i].getAuthor());
//                i++;
//            } else {
//                System.out.println("No books found");
//            }

//            if (books[i].getTitle().equalsIgnoreCase(bookName)) {
//                return;
//            }
//        }
//        if (counter == 0)
//            System.out.println("No Books of " + bookName + " found.");


    //Loan a book
    public void loanABook(){

    }
}

//        for (Book book : ) {
//
//            if (authorName.equalsIgnoreCase(books[i].getAuthor())) {
//
//                System.out.println(books[i].getAuthor());
//                s++;
//            }
//
//        }
//
//
//    }

// {
//         if (book.getTitle().contains(booksearch) || book.getAuthor().contains(booksearch)
//         {
//         return book;
//         }
//         }
//         return null;


//   public Book[] searchBook(String searchQuery) {

//        Book[] searchResult = new Book[MAX_BOOKS_COUNT];
//        int foundBooksCount = 0;
//
//        for (int i = 0; i < this.firstEmptyBookIndex; i++) {
//            Book bookToCheck = this.books[i];
//
//            boolean authorCheck = bookToCheck.getAuthor().contains(searchQuery);  //contains - czy zawiera dany fragment
//            boolean titleCheck = bookToCheck.getTitle().contains(searchQuery);
//
//            if (authorCheck || titleCheck) {
//                searchResult[i] = bookToCheck;
//                foundBooksCount++;
//            }
//
//        }
//        int actualIndex = 0;
//        Book[] searchResultToReturn = new Book[foundBooksCount];
//        for (Book book : searchResult) {
//            if (book != null) {
//                searchResultToReturn[actualIndex] = book;
//                actualIndex++;
//            }
//        }
//
//        return searchResultToReturn;
//    }


