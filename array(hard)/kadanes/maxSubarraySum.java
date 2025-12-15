public class maxSubarraySum {
    public static int sum(int[] arr) {
        int maxSoFar = arr[0];
        int curSoFar = arr[0];

        for(int i=0; i<arr.length; i++) {
            curSoFar = Math.max(curSoFar + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, curSoFar);
        }
        return maxSoFar;
    }
    public static void main(String args[]) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(sum(arr));
    }
}
