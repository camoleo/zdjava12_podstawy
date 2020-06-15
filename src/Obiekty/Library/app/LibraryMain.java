package Obiekty.Library.app;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();

        //dodawanie ksiazek do zbioru
        Book book1 = new Book("Niezwyciężony", "Stanisław Lem");
        Book book2 = new Book("Inny Swiat", "Gustaw Herling-Grudziński");
        Book book3 = new Book("Harry Potter", "J.K. Rowling");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        while (true) {                      //dlaczego takie wywołanie metody? jest inny sposób?
            showMenu(library);
        }

        //wyszukiwanie
        //       Book[] searchResult = library.searchBook("Lem");
        //      for (Book foundBook : searchResult) {
        //           System.out.println(foundBook);
    }
    //usuwanie
    //   library.removeBook();

    //   library.printBooks();

    static Scanner scanner = new Scanner(System.in);

    public static void showMenu(Library library) {

        System.out.println("--- Library Menu ---");
        System.out.println("---(1) View a book list ---");
        System.out.println("---(2) Add a book ---");
        System.out.println("---(3) Remove a book ---");
        System.out.println("---(4) Search a book ---");
        System.out.println("---(5) Loan a book ---");
        System.out.println("---(6) Book a book ---");
        System.out.println("---(7) Return a book ---");
        System.out.println("---(8) Register a new reader ---");
        System.out.println("---(9) View reader's loans and reservations ---");
        System.out.println("---(10) EXIT ---");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                library.printBooks();
            }
            break;
            case 2: {
                library.addBook();
            }
            break;
            case 3: {
                library.removeBook();
            }
            break;
            case 4: {
                library.searchByAuthorName();
            }
        }
    }
}