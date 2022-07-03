
public class SelectionSortAlgorithm {

    public static void selectionSortWithoutUsingOtherArray(int[] array) {
        int min = 0;
        for (int i = 0; array.length > i; i++) {
            min = i;
            for (int j = i + 1; array.length > j; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static int[] selectionSortWithUsingOtherArrayByFindingMinimum(int[] array) {
        int min;
        int[] arr = new int[array.length];
        for (int i = 0; arr.length > i; i++) {
            min = getMinimum(array);
            arr[i] = min;
            for (int j = 0; array.length > j; j++) {
                if (array[j] == min) {
                    array[j] = Integer.MAX_VALUE;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSortWithUsingOtherArrayByFindingMaximum(int[] array) {
       int max;
       int[] arr = new int[array.length];
       for(int i=arr.length-1; i>=0; i--){
           max=getMaximum(array);
           arr[i]=max;
           for (int j = 0; array.length > j; j++) {
                if (array[j] == max) {
                    array[j] = Integer.MIN_VALUE;
                }
            }
       }
       return arr;
    }

    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; array.length > i; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int getMaximum(int[]array){
        int max=0;
        for(int i=0; array.length>i;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
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
        int[] arr = selectionSortWithUsingOtherArrayByFindingMaximum(array);
        System.out.println("\nSorted---->");
        print(arr);
    }
}
