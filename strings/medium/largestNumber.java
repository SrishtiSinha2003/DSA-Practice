import java.util.Arrays;

public class largestNumber {

    public static String largNum(int[] nums) {

        // Step 1: Convert int array to String array
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        // Step 2: Custom sort
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Handle case like [0,0]
        if (s[0].equals("0")) {
            return "0";
        }

        // Step 4: Join all strings
        return String.join("", s);
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(largNum(nums)); // Output: 210
    }
}
