class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int m1 = m-1;
        int n2 = n-1;
        int mn = m+n -1;

        while(n2 >= 0){
            if(m1 >= 0 &&  nums1[m1] > nums2[n2] ){
            nums1[mn--] = nums1[m1--];
            }
            else 
            nums1[mn--]  = nums2[n2--];
        }
    }
}