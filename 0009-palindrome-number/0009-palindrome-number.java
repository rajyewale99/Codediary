class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=0;
        int num = x;
        while(num>0){
            n*=10;
            n+=(num%10);
            num = num/10;
        }
        return n==x;
    }
}