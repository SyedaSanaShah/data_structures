
public class InsertionSortAlgorithm {

    public static void insertionSort(int[] array) {
        int tempValue = 0;
        int tempIndex = 0;
        for (int i = 1; array.length > i; i++) {
            tempValue = array[i];
            tempIndex = i;
            while (tempIndex > 0 && array[tempIndex - 1] > tempValue) {
                array[tempIndex] = array[tempIndex-1];
                tempIndex = tempIndex - 1;
            }
            array[tempIndex] = tempValue;
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
        insertionSort(array);
        System.out.println("\nSorted---->");
        print(array);
    }
}
