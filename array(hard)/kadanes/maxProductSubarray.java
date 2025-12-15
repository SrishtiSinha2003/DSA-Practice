public class maxProductSubarray {

    public static int product(int[] arr) {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];
        int minEnding = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < 0) {
                // swap because negative sign flips max and min
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(arr[i], maxEnding * arr[i]);
            minEnding = Math.min(arr[i], minEnding * arr[i]);

            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2,6,-3,-10,0,2};
        System.out.println(product(arr)); // Output = 6
    }
}


