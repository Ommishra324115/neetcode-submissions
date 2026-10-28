class Solution {
    public boolean isPalindrome(String st) {
        // sentence.replaceAll("\\s", "");
        String s = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        int i=0 ; 
        while(i<n/2){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false ; 
            }
            i++ ;
        }
        return true ; 
    }
}
