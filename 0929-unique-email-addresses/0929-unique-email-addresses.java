class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>set = new HashSet<>();
        for(String str : emails){
            StringBuilder sb = new StringBuilder("");
            String[] str1 = str.split("@");
            String[] str2 = str1[0].split("\\+");
            String subStr = str2[0];
            subStr = subStr.replace(".","");
            String result = subStr+"@"+str1[1];
            set.add(result);
        }
        return set.size(); 
    }
}





// class Solution {
//     public int numUniqueEmails(String[] emails) {
//         HashSet<String>set = new HashSet<>();
//         for(int i=0; i<emails.length; i++){
//             String str = new String(emails[i]);
//             StringBuilder sb = new StringBuilder("");
//             int j=0;
//             while(str.charAt(j)!='@'){
//                 if(str.charAt(j)=='+'){
//                     break;
//                 }else if(str.charAt(j)!='.'){
//                     continue;
//                 }else{
//                     sb.append(str.charAt(j));
//                 }
//                 j++;
//             }
//             sb.append(str.substring(i,str.length()));
//             set.add(sb.toString());
//         }
//        return set.size();
//     }
// }