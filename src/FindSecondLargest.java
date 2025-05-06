public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,5,4,6,8,15,17};
        System.out.println(secondLargest(arr));
    }

    // Better Approach
//    public static int secondLargest(int[] arr) {
//        int secondLargest = Integer.MIN_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int num s: arr) {
//            if (num > max) {
//                max = num;
//            }
//        }
//
//        for (int num : arr) {
//            if (num > secondLargest && num < max) {
//                secondLargest = num;
//            }
//        }
//
//        return secondLargest;
//    }

    // Optimize Approach
    public static int secondLargest(int[] arr) {
        int firstLargest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
