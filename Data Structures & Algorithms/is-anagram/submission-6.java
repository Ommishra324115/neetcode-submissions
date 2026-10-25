class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        char strA[] = s.toCharArray();
        char strB[] = t.toCharArray();
        if(s.length() != t.length()){return false;}
        for(char a : strA ){
            arr[a - 'a']++;
        }
        for(char a : strB){
            arr[a - 'a']--;
        }
        for(int a : arr){
            if( a != 0){
                return false;
            }
        }
        return true;
    }
}
