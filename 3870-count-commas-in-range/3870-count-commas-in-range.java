class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n>=1000){
            for(int i=1000; i<=n; i++){
                String str = Integer.toString(i);
                if(str.length()>=7){
                    count+=2;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}