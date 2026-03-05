public class maxXorSubarray{
    public static int xor(int[] arr, int k) {
        int currXor = 0;
        for(int i=0; i<k; i++) {
            currXor ^= arr[i];
        }
        int maxXor = currXor;
        for(int i=k; i<arr.length; i++) {
            currXor ^= arr[i-k];
            currXor ^= arr[i];
            maxXor = Math.max(maxXor, currXor);
        }
        return maxXor;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 1, 3};
        int k = 3;
        System.out.print(xor(arr,k));
    }
}