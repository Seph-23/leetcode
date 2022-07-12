package greedy.leetcode122;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    static int maxProfit(int[] prices) {
        int curr, next;
        int profit = 0;

        for (int i = 0; i < prices.length-1; i++) {
            curr = prices[i];
            next = prices[i + 1];

            if (curr > next) {
                continue;
            }
            if (curr < next) {
                profit += next - curr;
            }
        }
        return profit;
    }
}
