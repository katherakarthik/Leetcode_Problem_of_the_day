class Solution {
    public long repairCars(int[] ranks, int cars) {
        long start=Long.MAX_VALUE;
        long end=Long.MIN_VALUE;
        for(int rank:ranks){
            end=Math.max(end,rank);
            start=Math.min(start,rank);

        }
        end=end*cars*cars;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isCar(mid,ranks,cars)){
                ans=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean isCar(long time,int ranks[],int cars){
        long carsr=0;
        for(int rank:ranks){
            carsr+=(long)(Math.sqrt((1.0*time)/rank));
            if(carsr>=cars)return true;
        }
        return false;
    }
}
