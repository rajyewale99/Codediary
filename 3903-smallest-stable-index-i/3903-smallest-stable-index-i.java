class Solution {
    public int firstStableIndex(int[] nums, int m) {
        int si[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            for(int j=0; j<=i; j++){
                maxi = Math.max(maxi,nums[j]);
            }
            for(int k=i; k<nums.length; k++){
                mini = Math.min(mini,nums[k]);
            }
            si[i]=maxi-mini;
        }
        for(int i=0; i<si.length; i++){
            if(si[i]<=m) return i;
        }
        return -1;
    }
}