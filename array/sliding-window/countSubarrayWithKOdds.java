public class countSubarrayWithKOdds {
    // helper function: at most k odd numbers
    private static int atMostK(int[] arr, int k) {
        int left = 0;
        int countOdd = 0;
        int result = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                countOdd++;
            }

            while (countOdd > k) {
                if (arr[left] % 2 != 0) {
                    countOdd--;
                }
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }

    // main function
    public static int numberOfSubarrays(int[] arr, int k) {
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9};
        int k = 2;
        System.out.println(numberOfSubarrays(arr, k));
    }
}

