class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int index=0;
        for(int num:nums){
            if(num!=0){
                res[index++]=num;
            }
        }
        while(index<n){
            res[index++]=0;
        }
        
        
        return res;
    }
}
