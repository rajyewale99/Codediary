class Solution {
    public boolean checkString(String s) {
        ArrayList<Character>ls = new ArrayList<>();
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            if(ls.contains('b') && s.charAt(i)=='a'){
                flag = false;
                return flag;
            }
            ls.add(s.charAt(i));
        }
        return flag;
    }
}