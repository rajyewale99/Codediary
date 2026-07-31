class Solution {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, String>map = new HashMap<>();
        int n = nums.length;
        int score[] = nums.clone();
        Arrays.sort(score);
        int j = 4;
        for(int i=n-1; i>=0; i--){
            if(i==n-1){
                map.put(score[i],"Gold Medal");
            }else if(i==n-2){
                map.put(score[i],"Silver Medal");
            }else if(i==n-3){
                map.put(score[i],"Bronze Medal");
            }else{
                map.put(score[i],String.valueOf(j++));
            }
        }
        String[] str = new String[n];
        for(int i=0; i<nums.length; i++){
            str[i] = map.get(nums[i]);
        }
        return str;
    }
}