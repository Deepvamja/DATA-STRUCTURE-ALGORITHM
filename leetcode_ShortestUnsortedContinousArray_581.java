class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int n = nums.length;

        int start = -1;
        int end = -2;

        int maxSoFar = Integer.MIN_VALUE;
        int minSoFar = Integer.MAX_VALUE;

        // Left → Right
        for (int i = 0; i < n; i++) {

            if (nums[i] < maxSoFar) {
                end = i;
            }

            maxSoFar = Math.max(maxSoFar, nums[i]);
        }

        // Right → Left
        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] > minSoFar) {
                start = i;
            }

            minSoFar = Math.min(minSoFar, nums[i]);
        }

        return end - start + 1;
    }
}