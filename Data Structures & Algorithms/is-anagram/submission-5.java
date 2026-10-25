class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
        HashMap<Character,Integer> map = new HashMap<>() ; 
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1) ; 
        }
        for(char c : t.toCharArray()){
            if (map.containsKey(c)) {
            int freq = map.get(c) - 1;
            if (freq == 0) map.remove(c);
            else map.put(c, freq);
            }
        }

        return map.size() > 0 ? false : true ; 
        }
    return false ; 
    }
}
