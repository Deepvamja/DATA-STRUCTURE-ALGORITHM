class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Element enters the window
            sum += nums[right];

            // Window is valid
            while (sum >= target) {

                // Calculate current window length
                int length = right - left + 1;

                // Keep the smallest valid window
                minLength = Math.min(minLength, length);

                // Remove leftmost element
                sum -= nums[left];

                // Move left boundary
                left++;
            }
        }

        // No valid subarray found
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}