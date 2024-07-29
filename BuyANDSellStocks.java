public class BuyANDSellStocks {
    public static int maxPro(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
           minPrice=Math.min(minPrice,prices[i]);
           maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }

return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,4,6,8,3};
        int maxProfit = maxPro(prices);
        System.out.println("The maximum profit is :" +maxProfit);
    }
}
