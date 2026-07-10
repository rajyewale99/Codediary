class Solution {
    public int reverse(int x) {
        long res = 0;
        int sign = 1;
        if(x<0) {
            sign = -1;
            x = -x;
        }
        while(x>0){
            res*=10;
            res+=(x%10);
            x = x/10;
            if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)(sign*res);
    }
}