package Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price > max) {
                max = price;
            }
            if (price < min) {
                min = price;
                max = 0; //Reset max to 0 to calculate profit with the next maximum after the new minimum
            }
            int profit = max - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
