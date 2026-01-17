public class findMinElement {
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        if(arr[low] <= arr[high]) { // arr is already sorted
            return arr[low];
        }

        while(low<=high) {
            int mid = low + (high - low)/2;

            //check mid+1
            if(mid<high && arr[mid+1] < arr[mid]) {
                return arr[mid+1];
            }

            //check mid-1
            if(mid>low && arr[mid] < arr[mid-1]) {
                return arr[mid];
            }

            // Decide which side to go
            if (arr[mid] >= arr[low]) {
                // Left half is sorted → go right
                low = mid + 1;
            } else {
                // Right half is sorted → go left
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
