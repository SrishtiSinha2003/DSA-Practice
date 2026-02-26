public class maxProductSubarray {
    public static int product(int[] arr) {
        int maxSoFar = arr[0];
        int minEnd = arr[0];
        int maxEnd = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < 0) {
                //swap
                int temp = maxEnd;
                maxEnd = minEnd;
                minEnd = temp;
            }
            maxEnd = Math.max(arr[i], maxEnd*arr[i]);
            minEnd = Math.min(arr[i], minEnd*arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnd);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-2,6,-3,-10,0,2};
        System.out.println(product(arr));
    }
}
