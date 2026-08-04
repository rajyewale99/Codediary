class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            start = Math.min(nums[i], start);
            end = Math.max(end, nums[i]);
            set.add(nums[i]);
        }
        List<Integer>list = new ArrayList<>();
        for(int i=start; i<=end; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}