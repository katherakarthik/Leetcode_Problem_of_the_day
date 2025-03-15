class Solution {
    public int minCapability(int[] nums, int k) {
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>end)end=num;
            if(num<start)start=num;
        }
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(isPos(mid,nums,k)){
                ans=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean isPos(int cap,int nums[],int minH){
        int robbed=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=cap){
                robbed++;
                i++;

            }
            if(robbed>=minH)return true;
        }
        return false;
    }
}
