package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, -5));
        rearrange(arr);
    }

    private static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> newArr = new ArrayList<>(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                newArr.set(i * 2 + 1, arr.get(i));
            }

            if (arr.get(i) > 0) {
                newArr.set(i * 2, arr.get(i));
            }
        }
        System.out.println(newArr);
    }
}
