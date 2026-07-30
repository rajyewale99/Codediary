class Solution {
    public int titleToNumber(String columnTitle) {
        int len = 0;
        int ans = 0;

        // //For Last Position
        // ans += columnTitle.charAt(len-1)-64;

        for(int i=columnTitle.length()-1; i>=0; i--){
            int val = columnTitle.charAt(i)-64;
            int res = (int)Math.pow(26,len++)*val;
            ans += res;
        }

        return ans;
    }
}