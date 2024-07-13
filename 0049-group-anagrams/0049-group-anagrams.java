class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm = new HashMap<>();
        
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr); //sorts the specified array into ascending numerical order. 
            String canonical = new String(arr);
            if(!hm.containsKey(canonical)){
                hm.put(canonical,new LinkedList<String>());
            }
            
            hm.get(canonical).add(str);
        }
        
        return new LinkedList<>(hm.values());
    }
}