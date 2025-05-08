package Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(moveZeroToEnd(arr)));
    }

    public static int[] moveZeroToEnd(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }

        while (pos < arr.length) {
            arr[pos++] = 0;
        }

        return arr;
    }
}
