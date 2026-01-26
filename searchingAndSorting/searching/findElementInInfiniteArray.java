public class findElementInInfiniteArray {
    // Function to perform binary search between low and high
    public static int binarySearch(int[] arr, int low, int high, int key) {
        // Continue loop while search space is valid
        while (low <= high) {
            // Calculate middle index
            int mid = (low + high) / 2;

            // If key is greater, move to right half
            if (arr[mid] < key)
                low = mid + 1;

            // If key is smaller, move to left half
            else if (arr[mid] > key)
                high = mid - 1;

            // If key is found, return index
            else
                return mid;
        }

        // If key is not found, return -1
        return -1;
    }

    // Function to find the index of a key in infinite sorted array
    public static int findIndex(int[] arr, int key) {
        // Start with low = 0 and high = 1
        int low = 0;
        int high = 1;

        // Expand the search space exponentially until arr[high] >= key
        while (high < arr.length && arr[high] < key) {
            low = high;
            high = high * 2;

            // Avoid out-of-bound error in real arrays
            if (high >= arr.length)
                high = arr.length - 1;
        }

        // Apply binary search in the found range
        return binarySearch(arr, low, high, key);
    }

    public static void main(String[] args) {
        // Sample infinite-like sorted array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        // Search for the key
        int ans = findIndex(arr, 130);

        // Output the index where the element is found
        System.out.println("Element found at index " + ans);
    }
}

