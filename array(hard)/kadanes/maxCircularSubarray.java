public class maxCircularSubarray {
    public static int sum(int[] arr) {
        int totalSum = 0;
        int minSoFar = arr[0], maxSoFar = arr[0];
        int curMin = arr[0], curMax = arr[0];

        for(int i=0; i<arr.length; i++){

            // Normal Kadane (max subarray)

            curMax = Math.min(curMax + arr[i], arr[i]);
            maxSoFar = Math.max(curMax, maxSoFar);

            // Reverse kadane (min subarray)

            curMin = Math.min(curMin + arr[i], arr[i]);
            minSoFar = Math.min(minSoFar, curMin);

            totalSum += arr[i];

        } 

        // include first element in totalSum
        totalSum += arr[0];

        // If all elements are negative

        if (minSoFar == totalSum)
            return maxSoFar;

        return Math.max(maxSoFar, totalSum - minSoFar);
    }
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        System.out.println(sum(arr));
    }
}

/*Two cases only:

Normal subarray (no circular wrap)
→ Just Kadane → maxSoFar

Circular subarray (wraps around end)
→ Take totalSum − minimum subarray sum

Why?
Because removing the worst (minimum) middle part gives the best circular sum.
Max Circular Sum = max(
    maxSubarraySum,
    totalSum − minSubarraySum
)
 
Special case:

If all numbers are negative

minSubarray == totalSum

Circular case becomes 0 → invalid
→ Return maxSubarraySum */
