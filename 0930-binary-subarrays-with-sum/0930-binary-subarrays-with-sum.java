class Solution {
    public int answer(int nums[],int goal){

        if(goal<0){
            return 0;
        }
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {


        return answer(nums,goal)-answer(nums,goal-1);
    }

}