class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==1)return nums[0];
        int totalSum=nums[0];
        int tempSum=nums[0];
        int resSum=nums[0];
        int tempSub=nums[0];
        int resSub=nums[0];
        for(int i=1;i<nums.length;i++){
            tempSum=nums[i]+Math.max(tempSum,0);
            resSum=Math.max(resSum,tempSum);
            tempSub=nums[i]+Math.min(tempSub,0);
            resSub=Math.min(tempSub,resSub);
            totalSum+=nums[i];
        }
        System.out.println(resSum);
        System.out.println(resSub);
        System.out.println(totalSum);
        if(resSub==totalSum){
            return resSum;
        }
        
        return Math.max(totalSum-resSub,resSum);
    }
}
