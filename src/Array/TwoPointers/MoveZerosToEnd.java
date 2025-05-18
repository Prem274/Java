package Array.TwoPointers;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZero(arr);
    }

    public static void moveZero(int[] arr) {
        int l = 0;
        int r = 0;

        int n = arr.length;
        while (r < n) {
            if (arr[l] == 0 && arr[r] != 0) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r++;
            }
            else if (arr[r] != 0) {
                l++;
                r++;
            }
            else if (arr[r] == 0) {
                r++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
