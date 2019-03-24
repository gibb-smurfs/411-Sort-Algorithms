package algorithms;

import java.util.Arrays;

public class InsertionSort {
    private static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] numbers = {1,6,3,7,4,4};
        sort(numbers);
    }
}
