class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();

        int[] prefix = new int[n+1];

        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i]+nums.get(i);
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i; j<n && j-i+1<=r; j++){
                int len = j - i + 1;
                int sum = prefix[j+1] - prefix[i];
                if(len>=l && sum>0){
                    ans = Math.min(ans,sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}