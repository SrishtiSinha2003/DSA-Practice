import java.util.ArrayList;
import java.util.HashMap;

public class subArrayWithContinuousSum {
    static int count = 0;   // total subarrays count
    
    public static ArrayList<Integer> sum (int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];

            //Case 1: subarray starts from index 0
            if (prefixSum == target) {
                result.add(0);
                result.add(i);
                return result;
            }  

            // Case 2: subarray exists between two indices
            if(map.containsKey(prefixSum - target)) {
                result.add(map.get(prefixSum - target) + 1);
                result.add(i);
                return result;
            }
            map.put(prefixSum, i);
        }
        // No subarray found
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 12, -2, -20, 10};
        int target = -10;
        ArrayList<Integer> result = sum(arr, target);

        if(result.get(0) != -1) {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        } else {
            System.out.println("No subarray found");
        }
    }
}
/*“If current prefixSum minus target has been seen before,
then the elements after that index till current index form the required subarray.” */
