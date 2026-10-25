class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ; 
        int sum1 = 0 ; 
        int n = nums.length ; 
        for(int ele : nums){
            sum1 += ele ; 
        }

        int expectedSum = n * (n + 1) / 2;
    return (expectedSum - sum1) ; 
    }
}
