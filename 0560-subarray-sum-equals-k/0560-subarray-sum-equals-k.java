class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefSum = 0;
        int required = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            prefSum += nums[i];
            required = prefSum - k;
            if(map.containsKey(required)){
                count = count + map.get(required);
            }
            if(map.containsKey(prefSum)){
                map.put(prefSum,map.get(prefSum)+1);
            }
            else  map.put(prefSum,1);
        }
        return count;
    }
}