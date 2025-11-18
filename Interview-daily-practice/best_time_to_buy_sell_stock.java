class best_time_to_buy_sell_stock {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if(prices[i]-buy>maxprofit){
                maxprofit=prices[i]-buy;

            }
        }
        return maxprofit;

        
    }
}