class Solution {
    static int[] dp ; 
    public static int helper(int[] arr , int i){
        if(i>=arr.length) return 0 ; 
        if(dp[i] != -1 ) return dp[i];
        return dp[i] = arr[i] + Math.min(helper(arr,i+1) , helper(arr,i+2)) ; 
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ; 
        dp = new int[n];
        Arrays.fill(dp,-1);
       return Math.min(helper(cost, 0), helper(cost, 1));
    }
}
