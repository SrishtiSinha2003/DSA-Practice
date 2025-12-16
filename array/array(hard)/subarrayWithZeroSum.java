import java.util.HashMap;

public class subarrayWithZeroSum {
    // Function to check whether there is a subarray present with 0-sum or not.
    public static boolean findSum(int[] arr) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum == 0)
                return true;
            if(map.containsKey(sum))
                return true;
            map.put(sum, i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(findSum(arr));
    }
}
