public class MakeProfit {

    /*Calculate Maximum Profit: Determines the maximum profit that can be obtained,
    *                           from stock prices by buying low and selling high.
    * Initialize Variables:
        minPrice: Tracks the smallest price encountered so far, initialized to Integer.MAX_VALUE.
        maxProfit: Tracks the highest profit calculated so far, initialized to 0.
    *Iterate Through Prices:
        If the current price is less than minPrice, update minPrice.
        Otherwise, calculate the profit if sold at the current price (price - minPrice) and update maxProfit if this profit is higher.
        Output: The method returns the maximum profit.

        Example:
        Input: prices = {7, 1, 5, 3, 6, 4}
    Steps:
        Day 1: minPrice = 7, maxProfit = 0
        Day 2: minPrice = 1, maxProfit = 0
        Day 3: maxProfit = 5 - 1 = 4
        Day 5: maxProfit = 6 - 1 = 5
        Output: Maximum Profit: 5
    * */
    public static void main(String[] args){
        int[] price={7,1,3,5,4,6};
        System.out.println("Profit: " + maxStockProfit(price));
    }

    private static int maxStockProfit(int[] prices){
        if(prices==null||prices.length<2){
            return 0;
        }
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

        }
        return maxProfit;
    }

    static int multipleTransAllowed(int[] prices){
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
