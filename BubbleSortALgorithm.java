
public class BubbleSortALgorithm {

    public static void bubbleSort(int[] array) {
        boolean isSorted = true;
        for (int i = 0; array.length > i; i++) {
            for (int j = 1; array.length - i > j; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    public static void print(int[] array) {
        for (int i = 0; array.length > i; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 7, 11, 3, 15, 4};
        System.out.println("Unsorted---->");
        print(array);
        bubbleSort(array);
        System.out.println("\nSorted---->");
        print(array);
    }
}
