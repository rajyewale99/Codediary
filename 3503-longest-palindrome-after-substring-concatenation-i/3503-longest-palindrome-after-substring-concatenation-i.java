class Solution {
    public boolean isPali(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public int longestPalindrome(String s, String t) {
        int maxi = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String str = s.substring(i,j);
                if(isPali(str)){
                    maxi = Math.max(maxi,str.length());
                }
            }
        }

        for(int i =0; i<t.length(); i++){
            for(int j=i+1; j<=t.length(); j++){
                String str = t.substring(i,j);
                if(isPali(str)){
                    maxi = Math.max(maxi,str.length());
                }
            }
        }

        for(int i=0; i<s.length(); i++){
            for(int j =i+1; j<=s.length(); j++){
                String str1 = s.substring(i,j);
                for(int x=0; x<t.length(); x++){
                    for(int y=x+1; y<=t.length(); y++){
                        String str2 = t.substring(x,y);
                        String combined = str1 + str2;
                        if(isPali(combined)){
                            maxi= Math.max(maxi, combined.length());
                        }
                    }
                }
            }
        }
        return maxi;
    }
}