class Solution {
    public long coloredCells(int n) {
        long ans=1;
        if(n==1)return 1;
        int x=4;
        // n--;
        while(n>1){
            ans+=x;
            x+=4;
            n--;

        }
        return ans;
        // long res=n;
        // return 1+2*(res-1)*res;
    }
}
