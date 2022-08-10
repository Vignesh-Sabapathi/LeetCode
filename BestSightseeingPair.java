class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0];
        int res=Integer.MIN_VALUE;
        for(int i=1;i<values.length;i++){
            max=Math.max(max,values[i-1]+i-1);
            res=Math.max(res,max+values[i]-i);      
        }
        return res;
    }
}
