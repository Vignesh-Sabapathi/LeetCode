class Solution {
    public int maxProduct(int[] nums) {
        int minProd=nums[0];
        int maxProd=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int choice1=minProd*nums[i];
            int choice2=maxProd*nums[i];
            minProd=Math.min(nums[i],Math.min(choice1,choice2));
            maxProd=Math.max(nums[i],Math.max(choice1,choice2));
            minProd=Math.min(nums[i],Math.min(minProd*nums[i],maxProd*nums[i]));
            maxProd=Math.max(nums[i],Math.max(minProd*nums[i],maxProd*nums[i]));
            ans=Math.max(ans,maxProd);
        }
        return ans;
    }
    
}
