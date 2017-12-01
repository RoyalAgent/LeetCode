public class Main {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }else{
            int temp;
            int min = prices[0];
            int maxprofit = 0;
            for(int i=1;i<prices.length;i++){
                min = Math.min(min,prices[i]);
                maxprofit = Math.max(maxprofit,prices[i]-min);
            }
            return maxprofit;
        }
    }
}
