class Solution {
    public int removeDuplicates(int[] nums) {

        // Edge case
        if (nums.length == 0) {
            return 0;
        }

        int officer = 0;   // Points to the last unique element
        int result = 1;    // First element is always unique
        int cm = 1;        // Starts checking from the second element

        while (cm < nums.length) {

            // If current element is same as previous, skip it
            if (nums[cm] == nums[cm - 1]) {
                cm++;
                continue;
            }

            // Found a new unique element
            nums[officer + 1] = nums[cm];
            officer++;
            result++;
            cm++;
        }

        return result;
    }
}