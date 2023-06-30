package Classes;


public class SearchExample {

    // Binary Search Algorithm
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Linear Search Algorithm
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        // Binary Search
        int binarySearchResult = binarySearch(numbers, target);
        if (binarySearchResult == -1) {
            System.out.println("Binary Search: Target not found.");
        } else {
            System.out.println("Binary Search: Target found at index " + binarySearchResult);
        }

        // Linear Search
        int linearSearchResult = linearSearch(numbers, target);
        if (linearSearchResult == -1) {
            System.out.println("Linear Search: Target not found.");
        } else {
            System.out.println("Linear Search: Target found at index " + linearSearchResult);
        }
    }
}

