import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        // Step 1: Sort the array
        Arrays.sort(people);

        // Step 2: Two pointers
        int left = 0;
        int right = people.length - 1;

        // Step 3: Count boats
        int boats = 0;

        // Step 4: Process until everyone gets a boat
        while (left <= right) {

            // Can the lightest and heaviest go together?
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            // Heaviest must go alone
            else {
                right--;
            }

            // One boat has been used
            boats++;
        }

        return boats;
    }
}