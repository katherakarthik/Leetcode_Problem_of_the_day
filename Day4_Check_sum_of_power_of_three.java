class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n<1)return  false;
        while(n>0){
            int rem=n%3;
            if(rem==2)return false;
            n/=3;
        }
        return true;
        // return power(n);
        // return res;
    }
    
    
}
