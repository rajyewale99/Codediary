class Solution {
    public String sortVowels(String s) {
        char str[] = s.toCharArray();
        ArrayList<Character>ls1 = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'){
                ls1.add(str[i]);
            }else if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                ls1.add(str[i]);
            }
        }
        Collections.sort(ls1);
        int j=0;
        for(int i=0; i<str.length; i++){
            if(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U' || str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' ){
                str[i] = ls1.get(j++);
            }
        }
        System.out.println(str);
        return String.valueOf(str);
    }
}