package Algorytmy_i_inne;

public class Zad4 {
    //wskaźniki

    //Zaimplementuj metodę "swap", która zaminie w tablicy wartości spod 2 zadanych indeksów. ([1,2,3,4,5], 1, 2) -> [1,3,2,4,5]
    public static void main(String[] args) {
        int[] testArray = {12, 454, 878, 56, 48, 78, 9};

        showArray(testArray);

    }

    private static void showArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            System.out.println(array[start]);
            if (start != end) {
                System.out.println(array[end]);
            }
            start++; //inkrementacja start = start +1;
            end--;
        }


    }

}
