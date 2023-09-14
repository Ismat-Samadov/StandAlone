package Classes;

public class LinearSearchExample {
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

        int result = linearSearch(numbers, target);
        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index " + result);
        }
    }
}

