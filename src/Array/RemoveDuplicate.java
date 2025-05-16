package Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,6};
        System.out.println(remove(arr));
    }

    private static int remove(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
}
