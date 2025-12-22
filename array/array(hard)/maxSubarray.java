public class maxSubarray {
    public static int maxSubArraySum(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        
        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update maxCurrent either by starting a new subarray or continuing the current subarray
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            
            // Update maxGlobal if maxCurrent is greater
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        
        return maxGlobal;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArraySum(nums));
    }
}

