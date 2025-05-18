package Array.Easy;

import java.util.ArrayList;

public class ReverseGroupArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
        System.out.println(reverseGroupArray(arr,3));
    }

    public static ArrayList<Integer> reverseGroupArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i+=k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                swap(arr,left++,right--);
            }
        }
        return arr;
    }

    private static void swap(ArrayList<Integer> arr, int left, int right) {
        int temp = arr.get(left);
        arr.set(left, arr.get(right));
        arr.set(right, temp);
    }
}
