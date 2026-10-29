class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;

        while (left < right) {
            int h = Math.min(arr[left], arr[right]);
            int area = h * (right - left);

            ans = Math.max(ans, area);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}