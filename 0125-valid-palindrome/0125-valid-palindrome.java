class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder newStr = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                newStr.append(Character.toLowerCase(i));
            }
        }
        int left=0;
        int right=newStr.length()-1;
        while(left<right){
            if(newStr.charAt(left)!=newStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}