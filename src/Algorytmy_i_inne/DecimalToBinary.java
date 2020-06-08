package Algorytmy_i_inne;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();

        decimalToBinary(decimal);
    }

    private static void decimalToBinary(int decimal) {
        String[] strings = new String[decimal];
        int i = 0;
        while (decimal != 0) {
            strings[i] = String.valueOf(decimal % 2);
            decimal /= 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(strings[j]);
        }
    }
}
// nie działa debugger tutaj - pojawia się bład - dlaczego?

//todo zrob petle while(x !=0, ktora dzieli x przez 2, i przypisuje wynik to x
//todo reszta z dzielenia ma byc "przyklejona" do zmiennej result
