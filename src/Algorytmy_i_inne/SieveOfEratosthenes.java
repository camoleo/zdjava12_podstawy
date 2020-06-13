package Algorytmy_i_inne;

import java.util.Scanner;

//Zad.3 Zaimplementuj algorytm "sito Erastotenesa" do wyszukiwania liczb pierwszych
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc zbioru liczb, z ktorego mam wypisac liczby pierwsze: ");

        int number = scanner.nextInt();

        sieveOfEratosthenes(number);
    }

    public static void sieveOfEratosthenes(int number) {

        boolean [] prime = new boolean[number + 1];
        for (int i = 2; i <= number; i++) {                      //* pętla generuje wszystkie liczby od 2 do n
            prime[i] = true;                                    // * poczatkowo oznacza każdą liczbe jako pierwsza
        }
        for (int p = 2; p <= Math.sqrt(number); p++) {          //* petla od 2 do pierwistek z number

            if (prime[p]) {
                for (int j = p; j * p <= number; j++)          //* jesli liczba jest pierwsza to petla wypisuje jej
                    prime[j * p] = false;                         //wielokrotnosci i je "wykreśla"
            }
        }
        for (int i = 2; i <= number; i++) {                 //petla wypisuje liczy pierwsze
            if (prime[i]) {
                System.out.println(i + " ");
            }
        }
    }


}
