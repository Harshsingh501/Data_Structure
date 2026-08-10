class Solution {

    private void swap(int [] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right]  = temp;
    }

    private void reverse( int [] nums, int left, int right){
        while( left < right){
        swap( nums , left, right);
        left++;
        right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-1;
        int j = n-1;
        while(  i > 0 && nums[i-1] >= nums[i]){
            i--;
        }
        if( i == 0){
            reverse(nums, 0, n-1);
            return;
        }

        while(j >i-1 && nums[j] <= nums[i-1]){
            j--;
        }
        swap( nums , i- 1, j);



        reverse(nums, i , n-1);
    }
}