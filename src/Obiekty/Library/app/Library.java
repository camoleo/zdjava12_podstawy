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
    private int firstEmptyIndex;
    //konstruktor - pusta tablica, do ktorej bedziemy wrzucac te ksiazki
    private static final int MAX_BOOKS_COUNT = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyIndex = 0;
    }


    public void printBooks() {
        for (Book book : books) {
            if (book == null) {

            } else {
                System.out.println(book);
            }
        }
    }


    public void addBook(Book book) {
        //ID
        this.books[firstEmptyIndex] = book;
        firstEmptyIndex++;
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

    public void searchByAuthorName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author's name:");
        String authorName = scanner.nextLine();
        int idCounter=0;
        int s = 0;
        for (int i = 0; i < idCounter; i++) {

            if (authorName.equalsIgnoreCase(books[i].getAuthor())) {

                System.out.println(books[i].getAuthor());
                s++;
            }

        }
        if (s == 0)
            System.out.println("No Books of " + authorName + " found.");

    }
}
//   public Book[] searchBook(String searchQuery) {

//        Book[] searchResult = new Book[MAX_BOOKS_COUNT];
//        int foundBooksCount = 0;
//
//        for (int i = 0; i < this.firstEmptyIndex; i++) {
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


