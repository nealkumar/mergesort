//https://gist.github.com/Kwistech/61cbfad410f132e2e5b70a5a94adfda1

public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 4, 3, 2, 1 };
		System.out.println("Initial Array: ");
		printArray(arr);
		arr = mergeSort(arr);
		System.out.println("Final Array: ");
		printArray(arr);
	}

	// Helper method to print out the integer array.
	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Breaks down the array to single or null elements in array.
	private static int[] mergeSort(int[] array) {
		// Recursive control 'if' statement.
		if (array.length <= 1) {

			return array;

		}
		int midpoint = array.length / 2;
		// Declare and initialize left and right arrays.
		int[] left = new int[midpoint];
		int[] right;
		if (array.length % 2 == 0) { // if array.length is an even number.
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}
		// Populate the left and right arrays.
		for (int i = 0; i < midpoint; i++) {
			left[i] = array[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = array[midpoint + j];
		}
		int[] result = new int[array.length];
		// Recursive call for left and right arrays.
		left = mergeSort(left);
		right = mergeSort(right);
		// Get the merged left and right arrays.
		result = merge(left, right);
		// Return the sorted merged array.
		return result;
	}

	// Merges the left and right array in ascending order.
	private static int[] merge(int[] left, int[] right) {
		// Merged result array.
		int[] result = new int[left.length + right.length];
		// Declare and initialize pointers for all arrays.
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		// While there are items in either array...
		while (leftPointer < left.length || rightPointer < right.length) {
			// If there are items in BOTH arrays...
			if (leftPointer < left.length && rightPointer < right.length) {
				// If left item is less than right item...
				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}
			}
			// If there are only items in the left array...
			else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			}

			// If there are only items in the right array...
			else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		}
		return result;
	}
}

https://gist.github.com/Kwistech/61cbfad410f132e2e5b70a5a94adfda1
