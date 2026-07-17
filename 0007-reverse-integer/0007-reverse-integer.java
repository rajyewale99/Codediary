class Solution {
    public int reverse(int x) {
        int flag = 1;
        if(x<0){
            flag = -1;
            x = -x;
        }
        long n = 0;
        while(x>0){
            n*=10;
            n+=(x%10);
            x = x/10;
            if(n<Integer.MIN_VALUE || n>Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)n*flag;
    }
}