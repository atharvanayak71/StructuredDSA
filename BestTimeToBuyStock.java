/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

 */

package StructuredDSA;

public class BestTimeToBuyStock {
    static int maxProfit(int [] prices) {
        int MinPrice = prices[0];
        int MaxProfit = 0;
        for(int i = 1; i<prices.length-1; i++){
            int Profit = prices[i]-MinPrice;
            MaxProfit = Math.max(MaxProfit, Profit);
            MinPrice = Math.min(MinPrice,prices[i]);
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
