package Algorytmy_i_inne;

public class Zad_analogiczne_do_4 {

    public static void main(String[] args) {
        int[] testArray = {10, 20, 1, 3, 100, 300};
        int[] arrayWithOneElement = {1};
        int[] emptyArray = {};
        printPairsSum(testArray);
    }
//wyświetl liczby parami z tabeli i je zsumuj
    //{10, 20, 1, 3, 100, 300} => 30, 4, 400
    // l   r
    private static void printPairsSum (int [] array){
       if(array.length % 2 == 0 && array.length > 1) {    //żeby tablica była większa niż 1
           int left = 0;
           int right = 1;
            while (right < array.length){
                System.out.println(array[left] + array[right]);
                left+=2;
                right+=2;
            }

       }else {
           System.out.println("Tablica ma nieparzystą ilość elementów.");
       }
    }
}
