import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            // Add the new fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 fruit types → shrink
            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                // No more of this fruit in the window
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            // Window is valid → update maximum
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}