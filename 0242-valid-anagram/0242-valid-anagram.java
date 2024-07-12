class Solution {
    public boolean isAnagram(String s, String t) {

//conert both to lowercase to ignore case match
        s = s.toLowerCase();
        t = t.toLowerCase();
//strip of all the white spaces
        s = s.replace(" ","");
        t = t.replace(" ","");
//initialize the bucket array
         int[] counts = new int[26];
// fill in the buckets
         for (int i=0; i<s.length();i++){
             counts[s.charAt(i)-'a']++;
         }                             
//empty the buckets
          for (int i=0; i<t.length();i++){
             counts[t.charAt(i)-'a']--;
         }                                          
 //check if all buckets are empty
          for (int count:counts){
              if(count!=0)
              return false;    
          }                                        
                                                  
         return true;                                        
        
        
    }
}