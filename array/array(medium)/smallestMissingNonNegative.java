public class smallestMissingNonNegative {
    public static int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];

        for (int x : nums) {
            int r = (x % value + value) % value;
            count[r]++;
        }

        int mex = 0;
        while (count[mex % value] > 0) {
            count[mex % value]--;
            mex++;
        }

        return mex;
    }
    public static void main(String[] args) {
        int[] nums = {1,-10,7,13,6,8};
        int value = 5;
        System.out.println(findSmallestInteger(nums, value));
    }
}

