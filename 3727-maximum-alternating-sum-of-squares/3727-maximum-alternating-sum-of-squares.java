class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                nums[i] = nums[i]*(-1);
            }
        }
        Arrays.sort(nums);
        long sum1 = 0;
        int mid = nums.length/2;
        for(int i=0; i<mid; i++){
            sum1 += nums[i]*nums[i];
        }

        long sum2 = 0;
        for(int i=mid; i<nums.length; i++){
            sum2 += nums[i]*nums[i];
        }
        return sum2-sum1;
    }
}