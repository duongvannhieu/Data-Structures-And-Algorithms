package arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] price) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
            }
            if (profit < price[i] - min) {
                profit = price[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,9};
        System.out.println(maxProfit(price));
    }
}
