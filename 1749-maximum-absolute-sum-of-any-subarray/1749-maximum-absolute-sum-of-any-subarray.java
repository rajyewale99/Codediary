class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSum = 0;
        int maxSum = 0;
        int currentMin = 0;
        int minSum = 0;
        
        for(int i=0; i<nums.length; i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum = Math.max(currSum, maxSum);

            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}