package Array;
public class BuyAndSellStocks{

    public int maximumProfit(int prices[]) {

        int minPrice = Integer.MAX_VALUE;   
        int maxProfit = 0 ;

        for(int i = 0 ; i<prices.length ; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6};
        BuyAndSellStocks b = new BuyAndSellStocks();
        System.out.println(b.maximumProfit(prices));
    }
}