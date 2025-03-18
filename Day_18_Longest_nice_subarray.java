class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start=0;
        int maxLen=0;
        int bitmask=0;
        int n=nums.length;
        for(int end=0;end<n;end++){
            while((bitmask&nums[end])!=0){
                bitmask=bitmask^nums[start];
                start++;
            }
            bitmask=bitmask|nums[end];
            maxLen=Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}
