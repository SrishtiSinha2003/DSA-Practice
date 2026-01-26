public class floorArray {
    public static int findFloor(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                result = mid; 
                low = mid + 1; 
            }
            else {
                high = mid - 1; // Move left
            }
        }
    return result;
}

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int x = 7;

        // Function call
        int index = findFloor(arr, x);
        System.out.println(index);
    }
}
