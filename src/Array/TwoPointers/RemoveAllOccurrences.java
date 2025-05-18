package Array.TwoPointers;
import java.util.Arrays;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int el = 2;
        remove(arr,el);
    }

    public static void remove(int[] arr, int el) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != el) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
