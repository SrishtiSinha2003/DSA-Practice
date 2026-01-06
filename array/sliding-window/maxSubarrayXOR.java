public class maxSubarrayXOR {
    public static int subarrayXOR(int[] arr, int k) {
        int n = arr.length;
        int currXOR = 0;
        for(int i=0; i<k; i++) {
            currXOR ^= arr[i];
        }
        int maxXOR = currXOR;
        for(int i=k; i<n; i++) {
            currXOR ^= arr[i-k];
            currXOR ^= arr[i];
            maxXOR = Math.max(maxXOR, currXOR);
        }
        return maxXOR;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,1,1,3};
        int k = 3;
        System.out.println(subarrayXOR(arr, k));
    }
}
