class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(num>0){
            int a = num%10;
            sum += a;
            product *= a;
            num = num/10;
        }
        if(n%(sum+product) == 0){
            return true;
        }
        return false;
    }
}