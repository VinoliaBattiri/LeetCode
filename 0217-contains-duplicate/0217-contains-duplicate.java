class Solution {
    public boolean containsDuplicate(int[] nums) {
        // declare HashSet to store nums:
        Set<Integer> set = new HashSet();
        // iterate over nums array:
        for(int i = 0; i < nums.length; i++) {
            // get num from nums
            int num = nums[i];
            // check if num is already in HashSet, if true return true
            if(set.contains(num)) return true;
            // add num into HashSet
            set.add(num); 
        }
        // return false if no dublicate found
        return false;
    }
}