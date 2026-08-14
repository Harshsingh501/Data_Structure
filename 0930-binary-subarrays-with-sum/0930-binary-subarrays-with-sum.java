class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0,1);
        for(int num: nums){
            prefixSum += num;
            int required = prefixSum - goal;
            if(map.containsKey(required)){
                count+= map.get(required);
            }
            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }
            else{
                map.put(prefixSum,1);
            }

        }
        return count;
    }

}