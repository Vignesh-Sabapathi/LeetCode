class Solution {
    public boolean canJump(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        return helper(nums,0,arr);
    }
    public boolean helper(int[] nums,int index,int[] arr){
        if(index>=nums.length-1){
            return true;
        }
        if(nums[index]==0){
            arr[index]=0;
            return false;
        }
        if(arr[index]!=-1){
            return arr[index]==1;
        }
        for(int i=1;i<=nums[index];i++){
            if(helper(nums,index+i,arr)){
                arr[index]=1;
                return true;
            }
        }
        arr[index]=0;
        return false;
    }
}
