package Array;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,0};
        System.out.println(maxConsecutive(arr));
    }

    public static int maxConsecutive(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;
        int maxCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
                oneCount = 0;
            } else if (num == 1) {
                oneCount++;
                zeroCount = 0;
            }
            maxCount = Math.max(maxCount, Math.max(zeroCount, oneCount));
        }
        return maxCount;
    }
}
