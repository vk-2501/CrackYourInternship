class Solution {
    public int maxProfit(int[] prices) {
        int lsf=Integer.MAX_VALUE;
        
        int pst=0;
        
        for(int i=0;i<prices.length;i++){
            lsf=Math.min(lsf,prices[i]);
            
            pst=Math.max(pst,prices[i]-lsf);
        }
        return pst;
    }public class Best_Time_To_Sell_And_Buy {
        
    }
    
}