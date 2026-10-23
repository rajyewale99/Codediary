class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 1;
        for(int i=0; i<nums.length; i++){
            if(min<nums[i] && nums[i]>0){
                min = Math.min(min,nums[i]);
            }
        }
        System.out.println(min);
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=min; i<=min+n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}