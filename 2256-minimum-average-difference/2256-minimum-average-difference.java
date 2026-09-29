class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        long minavg = Long.MAX_VALUE;
        int ans = 0;
        long sum1 = 0;
        for(int i=0; i<nums.length; i++){
            sum1 += nums[i];
            sum -= nums[i];
            long avg1 = sum1/(i+1);
            long avg2;
            if(nums.length-i-1 >0){
                avg2 = sum/(nums.length-i-1);
            }else{
                avg2 = 0;
            }
            long diff = Math.abs(avg1-avg2);
           
            if(diff<minavg){
                minavg = diff;
                ans = i;
            }  
        }
        return ans;
    }
}