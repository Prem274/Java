package Array.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,5,5};
        removeDuplicateInPlace(arr);
    }

    public static int uniqueElementCount(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                count++;
            }
        }

        return count;
    }
    
    public static void removeDuplicateInPlace(int[] arr) {
        if (arr.length == 0) {
            System.err.println("Empty Array");
            return;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, i+1)));
    }
}
