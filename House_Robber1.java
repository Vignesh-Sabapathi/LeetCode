class House_Robber1 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        
        
        int prev1=nums[0]>nums[1] ? nums[0]:nums[1];
        int prev2=nums[0],dp=prev1;
        for(int i=2;i<nums.length;i++){
            dp=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=dp;
        }
        return dp;
    }
}
