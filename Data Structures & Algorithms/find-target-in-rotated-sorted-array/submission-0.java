class Solution {
    public int search(int[] nums, int target) {
        // 3,4,5,6,1,2
        // l   m     h
        int left = 0 ; 
        int right = nums.length - 1 ;

        while(left <= right){
            int mid = left + (right - left)/2 ; 

            if(nums[mid]==target) return mid ; 

            if(nums[mid]>=nums[left]){
                // Left sorted
                if(target>=nums[left] && target<=nums[mid]){
                    right = mid-1 ;
                }else{
                    left=mid+1 ;
                }
            }else{
                // Right sorted 
                if(target>=nums[mid] && target<=nums[right]){
                    left = mid+1 ;
                }else{
                    right = mid-1 ;
                }
            }
         } 
         return -1 ;
    }
}
