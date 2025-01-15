public class MakeProfit {
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
}
