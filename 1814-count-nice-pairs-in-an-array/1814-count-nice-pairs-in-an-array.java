class Solution {
    public int rev(int num){
        int res = 0;
        while(num>0){
            res *= 10;
            res += num%10;
            num  /= 10;
        }
        return res;
    }
    public int countNicePairs(int[] nums) {
        long count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i]-rev(nums[i]),map.getOrDefault(nums[i]-rev(nums[i]),0)+1);
        }
        for(int val : map.values()){
            count += (long)val * (val - 1) / 2;
        }
        return (int)(count%1000000007);
    }
}