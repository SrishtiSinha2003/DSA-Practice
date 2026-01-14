public class findPeakElement {
    public static int element(int[] arr) {
        int low = 0;
        int high = arr.length;
        while(low < high) {
            int mid = low + (high - low) /2;
            if(arr[mid] < arr[mid+1]) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.print(element(arr));
    }
}
