class Solution {

    public int[] applyOperations(int[] nums) {

        int n = nums.length;

        // Phase 1: Apply operations
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1]) {

                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Phase 2: Move zeros
        int write = 0;

        for (int read = 0; read < n; read++) {

            if (nums[read] != 0) {

                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;

                write++;
            }
        }

        return nums;
    }
}