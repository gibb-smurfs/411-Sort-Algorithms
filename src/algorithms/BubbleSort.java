package algorithms;

import java.util.Arrays;

public class BubbleSort {
    private static void sort(int[] input) {
        int inputLength = input.length;
        int temp;
        boolean is_sorted;
        for (int i = 0; i < inputLength; i++) {
            is_sorted = true;
            for (int j = 1; j < (inputLength - i); j++) {
                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    is_sorted = false;
                }
            }
            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args){
        int[] numbers = {1,6,3,7,4,4};
        sort(numbers);
    }
}

