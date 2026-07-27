class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int one = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int two = nums[0]*nums[1]*nums[nums.length-1];
        int res = Math.max(one, two);
        int three = nums[0]*nums[1]*nums[2];
        res = Math.max(res, three);
        int four = nums[0]*nums[nums.length-1]*nums[nums.length-2];
        res = Math.max(res,four);
        return res;
    }
}