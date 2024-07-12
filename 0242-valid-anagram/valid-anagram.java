//brute force method
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray(); //toCharArray converts a string to character array
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
