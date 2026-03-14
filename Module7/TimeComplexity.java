package Module7;
import java.util.Arrays;

public class TimeComplexity {

    // 1. Linear Search: O(n) Time Complexity
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 2. Binary Search: O(log n) Time Complexity
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Create a large sorted array (1 million elements)
        int size = 1000000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = i;
        }

        int target = 999999; // Target at the very end to show worst-case

        // Measure Linear Search
        long startTime = System.nanoTime();
        linearSearch(data, target);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Time: " + (endTime - startTime) + " ns");

        // Measure Binary Search
        startTime = System.nanoTime();
        binarySearch(data, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time: " + (endTime - startTime) + " ns");
    }
}