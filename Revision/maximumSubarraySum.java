// kadane's algorithm
public class maximumSubarraySum {
    public static int max(int[] arr) {
        int maxSoFar = arr[0];
        int currSoFar = arr[0];
        for(int i=1; i<arr.length; i++) {
            currSoFar = Math.max(currSoFar+arr[i], arr[i]);
            if(currSoFar > maxSoFar) {
                maxSoFar = currSoFar;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(max(arr));
    }
}
