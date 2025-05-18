package Array.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,5};
        remove(arr);
    }

    public static void remove(int[] arr) {
        int i = 0;
        int j = 1;
        int el = 0;

        while (i < arr.length) {
            if (el < arr[i]) {
                el = arr[i];
                i++;
            }

            if (arr[i] == el) {
                j = i;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
