class Solution {
    public int maximumCount(int[] nums) {
        // int neg=0;
        // int pos=0;
        // int curri=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0)neg++;
        //     if(nums[i]>0){
        //         // pos=nums.length-curri;
        //         curri=i;
        //         pos=nums.length-i;
                
        //     }

        // }
        // return Math.max(pos,neg);
        int n=nums.length;
        int end=n-1;
        int negPos=binarySearch(nums,0,end,-1);
        int posPos=binarySearch(nums,negPos,end,0);
        
        int posCount=(n-posPos);
        // int end=n-1;
        return Math.max(negPos,posCount);
    }
    public int binarySearch(int nums[],int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
