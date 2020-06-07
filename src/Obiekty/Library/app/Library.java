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
public class Library {

    private Book[] books;
    private int firstEmptyIndex;
    //konstruktor - pusta tablica, do ktorej bedziemy wrzucac te ksiazki
    private static final int MAX_BOOKS_COUNT = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
    }

    public void addBook(Book book) {
        this.books[firstEmptyIndex] = book;
        firstEmptyIndex++;
    }

    public void printBooks(){
        for(int i = 0;i < books.length;i++){
            if(books[i] != null){
                System.out.println(books[i]);
            }
        }
    }
    public Book[] searchBook(String searchQuery) {
        Book[] searchResult = new Book[MAX_BOOKS_COUNT];
        int foundBooksCount = 0;

        for (int i = 0; i < this.firstEmptyIndex; i++) {
            Book bookToCheck = this.books[i];

            boolean authorCheck = bookToCheck.getAuthor().contains(searchQuery);               //contains - czy zawiera dany fragment
            boolean titleCheck = bookToCheck.getTitle().contains(searchQuery);

            if (authorCheck || titleCheck) {
                searchResult[i] = bookToCheck;
                foundBooksCount++;
            }

        }
        int actualIndex = 0;
        Book[] searchResultToReturn = new Book[foundBooksCount];
        for (int i = 0; i < searchResult.length; i++) {
            if (searchResult[i] != null) {
                searchResultToReturn[actualIndex] = searchResult[i];
                actualIndex++;
            }
        }

        return searchResult;
    }
}

