class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String>map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                i++;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(i)!=')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                if(map.containsKey(sb.toString())){
                    res.append(map.get(sb.toString()));
                }else{
                    res.append("?");
                }
                i++;
            }else{
                res.append(s.charAt(i));
                i++;
            } 
        }
        return res.toString();
    }
}