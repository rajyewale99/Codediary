class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer>ls = new ArrayList<>();
        List<Double>res = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            ls.add(nums[i]);
        }
        while(ls.size()>0){
            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;
            for(int i=0; i<ls.size(); i++){
                mini = Math.min(mini, ls.get(i));
                maxi = Math.max(maxi, ls.get(i));
            }
            res.add((mini+maxi)/2.0);
            ls.remove(Integer.valueOf(mini));
            ls.remove(Integer.valueOf(maxi));
        }
        double ans = Integer.MAX_VALUE;
        for(int i=0; i<res.size(); i++){
            ans = Math.min(ans, res.get(i));
        }
        return ans;
    }
}