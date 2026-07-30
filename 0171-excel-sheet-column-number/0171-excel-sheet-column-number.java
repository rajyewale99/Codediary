class Solution {
    public int titleToNumber(String columnTitle) {
        int len = 1;
        int ans = 0;
        for(int i=columnTitle.length()-2; i>=0; i--){
            int val = columnTitle.charAt(i)-64;
            int res = (int)Math.pow(26,len++)*val;
            ans += res;
        }
        ans += columnTitle.charAt(len-1)-64;
        return ans;
    }
}