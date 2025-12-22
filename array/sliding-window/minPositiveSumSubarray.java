public class minPositiveSumSubarray {
    public static int sum(int[] nums, int l, int r) {
        int n = nums.length;
        
        // Prefix sum array
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        int minSum = Integer.MAX_VALUE;
        
        // Try all lengths from l to r
        for (int len = l; len <= r; len++) {
            for (int i = 0; i + len <= n; i++) {
                int sum = prefix[i + len] - prefix[i];
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }
        
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, -2, 1, 4};
        int l = 2, r = 3;
        System.out.println(sum(nums, l, r));
    }
}
