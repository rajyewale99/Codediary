class Solution {
    public int minAddToMakeValid(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                cnt1++;
            }else if(cnt1>0 && s.charAt(i)==')'){
                cnt1--;
            }else{
                cnt2++;
            }
        }
        return cnt1+cnt2;
    }
}