public class countElementsInRotatedArray {
    public static int countLessEqual(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= k) {
                ans = mid;      // possible answer
                low = mid + 1;  // try to find larger index
            } else {
                high = mid - 1;
            }
        }

        return ans + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,1,3,6,8,20};
        int k = 3;
        System.out.println(countLessEqual(arr,k));
    }
}


