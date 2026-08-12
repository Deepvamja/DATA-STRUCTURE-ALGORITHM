class Solution {

    void segregate0and1(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip all correct 0s from the left
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Skip all correct 1s from the right
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap the misplaced elements
            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}





// using if else method

//   void segregate0and1(int[] arr) {

//         int left = 0;
//         int right = arr.length - 1;

// while (left < right) {

//     if (arr[left] == 0) {

//         left++;

//     } else if (arr[right] == 1) {

//         right--;

//     } else {

//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;

//         left++;
//         right--;
//     }
// }

//}