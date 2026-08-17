class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int prefSum = 0;
        map.put(0,1);
        for(int num : nums){
            prefSum += num; 
            int required = prefSum - goal;
            if(map.containsKey(required)){
                count+= map.get(required);
            }
            if(map.containsKey(prefSum)){
                map.put(prefSum,map.get(prefSum)+1);
            }
            else map.put(prefSum,1);
        }
        return count;
    }
}