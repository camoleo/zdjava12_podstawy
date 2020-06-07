package Obiekty.Library.app;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args) {

        Book book1 = new Book("Niezwyciężony", "Stanisław Lem");
        Book book2 = new Book("Inny Swiat", "Gustaw Herling-Grudziński");
        Book book3 = new Book("Harry Potter", "J.K.Rowling");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printBooks();
       Book [] searchResult = library.searchBook("Inny");
        for (Book foundBook : searchResult){
            System.out.println(foundBook);
        }
    }
}
