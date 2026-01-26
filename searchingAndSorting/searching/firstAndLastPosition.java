import java.util.Arrays;

public class firstAndLastPosition {
    public static int[] find(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }
    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = find(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
