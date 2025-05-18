package Array.TwoPointers;

public class PairOfElement {
    public static int[] pairIndex(int[] arr, int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (arr[l] + arr[r] == x) return new int[]{l+1, r+1};
            if (arr[l] + arr[r] < x) l++;
            else r--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 19;

        int[] result = pairIndex(arr, target);
        if (result.length == 0) {
            System.out.println("No such pair found");
        } else {
            System.out.printf("Element found at index %d and %d",result[0], result[1]);
        }
    }
}