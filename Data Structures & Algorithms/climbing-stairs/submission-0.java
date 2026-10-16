class Solution {
    static int[] dp ; 

    public static int helper(int n , int i){
        if(i>=n) return i==n ? 1:0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = helper(n,i+1) + helper(n,i+2) ;
    }

    public int climbStairs(int n) {
        dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n,0);    
    }
}
