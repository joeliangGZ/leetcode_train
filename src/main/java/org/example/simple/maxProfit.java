package org.example.simple;

public class maxProfit {

    // This method calculates the maximum profit that can be made from buying and selling a stock
    public int maxProfit(int[] prices) {
        // Initialize the maximum profit to 0
        int maxProfit = 0;
        // Initialize the minimum price to the first price in the array
        int minPrice = prices[0];
        // Loop through the array of prices
        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than the minimum price, update the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            // If the difference between the current price and the minimum price is greater than the maximum profit, update the maximum profit
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        // Return the maximum profit
        return maxProfit;
    }

    public static void main(String[] args) {
        maxProfit obj = new maxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
     */
}