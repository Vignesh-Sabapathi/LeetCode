class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int s:prices){
            if(s>min)max=Math.max(s-min,max);
            else min=s;
        }
        
        return max;
    }
}
