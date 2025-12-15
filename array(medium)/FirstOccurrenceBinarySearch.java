public class FirstOccurrenceBinarySearch {

    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                result = mid;        // store answer
                high = mid - 1;      // search on left
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;

        int index = firstOccurrence(arr, target);

        System.out.println("First occurrence at index: " + index);
    }
}
