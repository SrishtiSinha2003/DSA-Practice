public class xorOfNumAppearTwice {
    public static int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51]; // because nums[i] <= 50

        for (int num : nums) {
            freq[num]++;
        }

        int xor = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                xor ^= i;
            }
        }

        return xor;
    }
    public static void main(String[] args) {
        int[] num = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(num));
    }
}
