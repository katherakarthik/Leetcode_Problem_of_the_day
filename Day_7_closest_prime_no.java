class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[]=new boolean[right+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int p=2;p*p<=right;p++){
            if(prime[p]){
                for(int i=p*p;i<=right;i+=p)
                    prime[i]=false;
                
            }
        }
        int res[]=new int[]{-1,-1};
        int mindiff=Integer.MAX_VALUE;
        int prev=-1;
        for(int i=left;i<=right;i++){
            if(prime[i]){
                if(prev==-1){
                    prev=i;
                }
                else {
                    if(i-prev<mindiff){
                        res[0]=prev;
                        res[1]=i;
                        mindiff=i-prev;
                    }
                    prev=i;
                }
            }
        }
        return res;
    }
}

//Second method
import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        // Initialize the result array
        int[] res = new int[]{-1, -1};
        int minDiff = Integer.MAX_VALUE;

        // Generate all prime numbers in the range [left, right]
        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // Find the pair of consecutive primes with the smallest difference
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                res[0] = primes.get(i - 1);
                res[1] = primes.get(i);
            }
        }

        return res;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


















