package Array;

public class FindThirdLargest {
    public static void main(String[] args) {
        int[] arr = {
                855, 450, 132, 359, 233, 825, 604, 481, 262, 337,
                720, 525, 652, 300, 906, 219, 926, 906, 293, 864,
                817, 498, 30, 639, 661
        };
        System.out.println(findThirdLargest(arr));
    }

    public static int findThirdLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;
        int tLarge = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j == large || j == sLarge || j == tLarge) {
                continue;
            }

            if (j > large) {
                tLarge = sLarge;
                sLarge = large;
                large = j;
            } else if (j > sLarge) {
                tLarge = sLarge;
                sLarge = j;
            } else if (j > tLarge) {
                tLarge = j;
            }
        }

        return tLarge;
    }
}
