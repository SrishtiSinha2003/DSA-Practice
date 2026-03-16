import java.util.*;
public class countDistinctInWindow {
    public static ArrayList<Integer> distinct(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        result.add(map.size());
        for(int i=k; i<arr.length; i++) {
            int prev = arr[i-k];
            map.put(prev, map.get(prev) - 1);
            if(map.get(prev) == 0) {
                map.remove(prev);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            result.add(map.size());
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;
        ArrayList<Integer> result = distinct(arr, k);
        System.out.print(result);
    }
}
