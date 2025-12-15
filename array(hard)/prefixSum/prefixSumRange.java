import java.util.ArrayList;

public class prefixSumRange {

    // Build prefix sum array
    public static ArrayList<Integer> buildPrefixSum(int[] arr) {
        ArrayList<Integer> prefix = new ArrayList<>();

        prefix.add(arr[0]); // first element

        for (int i = 1; i < arr.length; i++) {
            prefix.add(prefix.get(i - 1) + arr[i]);
        }
        return prefix;
    }

    // Get sum from index i to j (inclusive)
    public static int rangeSum(int i, int j, ArrayList<Integer> prefix) {
        if (i == 0)
            return prefix.get(j);

        return prefix.get(j) - prefix.get(i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};

        ArrayList<Integer> prefixSum = buildPrefixSum(arr);

        // Print prefix sum
        System.out.println(prefixSum);   // [10, 30, 40, 45, 60]

        // Range sum queries
        System.out.println(rangeSum(1, 3, prefixSum)); // 20 + 10 + 5 = 35
        System.out.println(rangeSum(2, 4, prefixSum)); // 10 + 5 + 15 = 30
    }
}


