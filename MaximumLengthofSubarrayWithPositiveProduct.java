class Solution {
    public int getMaxLen(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;){
            int s=i;
            
            while(s<n && nums[s]==0)s++;
            int e=s;
            int sn=-1;
            int en=-1;
            int c=0;
            while(e<n &&nums[e]!=0){
                if(nums[e]<0){
                    c++;
                    if(sn==-1)sn=e;
                    en=e;
                }
                e++;
            }
            if(c%2==0){
                ans=Math.max(ans,e-s);
            }else{
                if(sn!=-1)ans=Math.max(ans,e-sn-1);
                if(en!=-1)ans=Math.max(ans,en-s);
            }
            i=e+1;
        }
        return ans;
    }
