class Solution {
    public boolean isPalindrome(int x) {
        
         if (x < 0) {
            return false;
        }
        
        String y = String.valueOf(x);//converts the number to a string representation
        int left = 0;
        int right = y.length() - 1;
        
        while(left<right){
            if(y.charAt(left) == y.charAt(right)){
                left++;
                right--;
            }
            else
                return false;
        }return true;
        
    }
}