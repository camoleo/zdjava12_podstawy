package Algorytmy_i_inne;

import java.util.Scanner;

public class Zad2_inne_rozwiazanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int i = 0;

        int[] binary = new int [100];

        System.out.println("Enter decimal number: ");
        number = scanner.nextInt();

        while (number!=0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("Binary value is: ");
        for (int j = i-1; j >=0; j--)
        {
            System.out.print(""+ binary[j]);
        }
    }
} //komentarz