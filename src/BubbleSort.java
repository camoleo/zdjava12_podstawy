public class BubbleSort {
    //[4,5,7,3,1,2,6] -> [1, 2, 3, 4, 5, 6, 7]
// l = 6
    //cykl (i) = 0 => 5 <= (6 - i - 1)
    //cykl (i) = 1 => 4 <= (6 - i - 1)
    //cykl (i) = 2 => 3 <= (6 - i - 1)
    //cykl (i) = 3 => 2 ...
    //cykl (i) = 4 => 1
    //cykl (i) = 5 => 0

    public static void main(String[] args) {
        int[] testArray = {5, 4, 3, 2, 1};
        bubbleSort(testArray);
        print(testArray);

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                int left;
                left = j;
                int right = j + 1;

                if (arr[left] > arr[right]) {
                    swap(arr, left, right);
                }
            }
        }
    }


    static private void swap(int[] arr, int indexLeft, int indexRight) {
        int leftValue = arr[indexLeft];
        int rightValue = arr[indexRight];

        arr[indexLeft] = rightValue;
        arr[indexRight] = leftValue;
    }

    private static void print(int[] arr) {
        for (int value : arr) {
            System.out.print("[" + value + "]");
        }
    }
}

