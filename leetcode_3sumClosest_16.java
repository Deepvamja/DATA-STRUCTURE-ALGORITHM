import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Initialize closest sum
        int closest = nums[0] + nums[1] + nums[2];

        // Step 3: Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            // Step 4: Two pointers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Step 5: Update closest sum
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Step 6: Perfect answer
                if (sum == target) {
                    return sum;
                }
                // Step 7: Need a bigger sum
                else if (sum < target) {
                    left++;
                }
                // Step 8: Need a smaller sum
                else {
                    right--;
                }
            }
        }

        return closest;
    }
}