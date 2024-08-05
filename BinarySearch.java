
class BinarySearch {

	int binarySearch(int arr[], int left, int right, int x) {
		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == x) {
				return mid;

			} else if (arr[mid] > x) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	
		public static void main(String args[]) {
			BinarySearch bs = new BinarySearch();

			int arr[] = { 2, 3, 4, 10, 40 };
			int n = arr.length;
			int x = 10;
			int result = bs.binarySearch(arr, 0, n - 1, x);

			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at index "
						+ result);
		}
	}

