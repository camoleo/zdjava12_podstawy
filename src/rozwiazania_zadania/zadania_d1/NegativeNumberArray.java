package rozwiazania_zadania.zadania_d1;

import java.util.ArrayList;
import java.util.List;

public class NegativeNumberArray {
// Zadanie 6.   Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//    utwórz nową tablicę, do której przepisze tylko te ujemne liczby


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();   //nie może tu być typów prymitywnych


        //wyświetlanie tablicy - sposób 1
        arrayList.add(19);
        arrayList.add(-3);
        arrayList.add(53);
        arrayList.add(543);
        arrayList.add(-984);
        arrayList.add(-7142);

        System.out.println(arrayList);

        //*wyświetlanie za pomocą pętli for - sposób 2 - właściwy

        for (Integer integer : arrayList)
            System.out.println(integer);

        //*wyswietlanie liczby elementow w arrayList

        System.out.println("Number of elemens in arrayList: " + arrayList.size());


        //*dodawanie elementu na konkretny indeks

        System.out.println("arrayList z dodanym elementem na indeksie 0:");
        arrayList.add(0, -200);
        for (Integer integer : arrayList)
            System.out.println(integer);

        //*usuwanie elementu z arrayList
        System.out.println("arrayList z usuniętym elementem na indeksie 1:");
        Integer remove = arrayList.remove((1));
        for (Integer integer : arrayList)
            System.out.println(integer);

        //**lub
        System.out.println("arrayList z usuniętym elementem na indeksie 0:");
        arrayList.remove(0);
        for (Integer integer : arrayList)
            System.out.println(integer);

        //*przepisanie liczb ujemnych do nowej arrayList
        ArrayList<Integer> getNegatives = new ArrayList<>();
        for (int n : arrayList) {
            if (n < 0) {
                getNegatives.add(n);
            }
        }
        System.out.println( "Tablica zawiera " + getNegatives.size()+ " liczb ujemnych.");
        System.out.println( "liczby ujemne to: " + getNegatives);

    }
}



//zrodlo:https://beginnersbook.com/2013/12/java-arraylist/