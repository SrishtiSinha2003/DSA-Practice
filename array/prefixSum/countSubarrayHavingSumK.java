import java.util.ArrayList;
import java.util.HashMap;
public class countSubarrayHavingSumK {

    static int count = 0;

    public static ArrayList<Integer> sum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: subarray from index 0
            if (prefixSum == target) {
                count++;

                // store first found subarray only
                if (result.isEmpty()) {
                    result.add(0);
                    result.add(i);
                }
            }

            // Case 2: subarray exists in between
            if (map.containsKey(prefixSum - target)) {
                count += map.get(prefixSum - target);

                // store first found subarray only
                if (result.isEmpty()) {
                    result.add(i - 1); // start index handled below
                    result.add(i);
                }
            }

            // store frequency (NOT index)
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int target = 35;

        ArrayList<Integer> result = sum(arr, target);

        if (result.get(0) != -1) {
            System.out.println("Subarray found from index "
                    + result.get(0) + " to " + result.get(1));
        } else {
            System.out.println("No subarray found");
        }

        System.out.println("Total subarrays count = " + count);
    }
}

