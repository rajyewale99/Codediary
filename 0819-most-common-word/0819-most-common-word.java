class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String stri = paragraph.toLowerCase();
        System.out.println(stri);
        String[] str = stri.split("[^a-z]+");
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0; i<str.length; i++){
            map.put(str[i], map.getOrDefault(str[i],0)+1);
        }
        HashSet<String>set = new HashSet<>();
        for(int i=0; i<banned.length; i++){
            set.add(banned[i]);
        }
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(!set.contains(m.getKey()) && m.getValue()>count){
                count = m.getValue();
                sb.setLength(0);
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}