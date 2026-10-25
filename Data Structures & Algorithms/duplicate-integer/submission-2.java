class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int ele : map.keySet()) {
        if (map.get(ele) >= 2) {
                return true ; 
           }
        }
    return false ; 
    }
}