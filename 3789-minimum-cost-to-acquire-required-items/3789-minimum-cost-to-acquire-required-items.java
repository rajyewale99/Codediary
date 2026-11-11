class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long res = Long.MAX_VALUE;

        long case1 = (long)cost1*need1 + (long)cost2*need2;

        int both = Math.min(need1, need2);

        long case2 = (long)both*costBoth + (long)(need1-both)*cost1 + (long)(need2-both)*cost2;

        long case3 = (long)costBoth * Math.max(need1,need2);

        res = Math.min(case1, Math.min(case2,case3));

        return res;
    }
}