package Algorytmy_i_inne;

import java.util.Scanner;

//Napisz program, który zamieni liczbę dziesiętną na string złożonego z 0 i 1, który jest jego reprezentacją binarną
public class Zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive decimalNumber: ");
        int decimalNumber = scanner.nextInt();
        //wyswietl info ze liczba nie jest dodatnia jesli <0
        if (decimalNumber <= 0) {
            System.out.println("Entered decimalNumber not positive. Try again.");
        } else
            System.out.println("Convert to binary is: ");

        printBinary(decimalNumber);

    }

    static private void printBinary(int decimalNumber) {
        int remainder;                              //zmienna przechowuje reszte z dzielenia

        if (decimalNumber <= 1) {
            System.out.println(decimalNumber);
            return;
        }
        remainder = decimalNumber % 2;
        printBinary(decimalNumber >> 1);
        System.out.println(remainder);
    }


}
//W TYM ZADANIU MOZNA UZYC METODY Integer.toBinaryString() -> Integer.toString(n,2) gdzie n to dziesiętna liczba

// W jednym kroku algorytmu wykonujemy dwie czynności:

//  * wyznaczamy resztę z dzielenia przez 2 konwertowanej liczby
//  * konwertowaną liczbę dzielimy przez 2 (dzielenie całkowite)
// Daną czynność wykonujemy tak długo, jak długo liczba dziesiętna jest większa od 0.