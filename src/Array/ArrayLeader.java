package Array;

import java.util.ArrayList;

public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 4, 1};
        System.out.println(findLeaderArray(arr));
    }

    private static ArrayList<Integer> findLeaderArray(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                arrayList.add(0,max);
            }
        }
        return arrayList;
    }
}
