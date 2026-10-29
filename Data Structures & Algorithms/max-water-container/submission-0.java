class Solution {
    public int maxArea(int[] arr) {
        int left = 0 ; 
        int right = arr.length - 1 ; 
        int ans = 0 ; 

        while(left < right ){
            int area = 0 ; 
            if(arr[left]<arr[right]){
                int h = Math.min(arr[left],arr[right]);
                area = h * (right-left);
                ans = Math.max(area,ans);
                left++ ;
            }else{
                int h = Math.min(arr[left],arr[right]);
                area = h * (right-left);
                ans = Math.max(area,ans);
                right--;
            }
        }
        return ans ; 
    }
}
