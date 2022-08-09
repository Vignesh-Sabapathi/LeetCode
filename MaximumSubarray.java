class Solution {
    public int maxSubArray(int[] numss) {
        if(nums.length==1)return nums[0];
        int resmax=nums[0];
        int tempmax=nums[0];
        for(int i=1;i<nums.length;i++){
            tempmax=Math.max(nums[i],nums[i]+tempmax);
            resmax=Math.max(tempmax,resmax);
        }
        return resmax;
    }
}
