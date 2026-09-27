class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        List<Integer>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        Collections.sort(list);
        int qnt = Integer.MIN_VALUE;
        for(int m : map.values()){
            if(m>qnt){
                qnt = m;
            }
        }
        int i=0;
        while(i<qnt){
            for(int j=0; j<list.size(); j++){
                if(map.containsKey(list.get(j)) && map.get(list.get(j))>0){
                    ans.add(list.get(j));
                    map.put(list.get(j),map.get(list.get(j))-1);
                }
                
            }
            i++;
        }
        int arr[] = new int[ans.size()];
        for(int k=0; k<arr.length; k++){
            arr[k] = ans.get(k);
        }
        return arr;
    }
}