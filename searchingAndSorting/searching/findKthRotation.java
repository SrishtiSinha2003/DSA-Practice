public class findKthRotation {
    public static int find(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            if(arr[left] <= arr[right]) {  // If subarray is already sorted, 
                                           // smallest is at low
                return left;
            }
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[right]) {  // Minimum is in the right half
                left = mid+1;
            } else {
                right = mid; // left half could be mid
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        System.out.println(find(arr));
    }
}
