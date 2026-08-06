class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            int prod = 1;
            int val = i;
            while(val>0){
                prod*=(val%10);
                val/=10;
            }
            if(prod%t==0) return i;
        }
        return n;
    }
}