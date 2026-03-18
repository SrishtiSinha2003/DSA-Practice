import java.util.HashMap;
public class countSubarrayWithNiceSum {
    public static int countSub(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int x : arr) {
           sum += x % 2;
           if(map.containsKey(sum - k)) {
            count += map.get(sum-k);
           }
           map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k = 3;
        System.out.print(countSub(arr, k));
    }
}
