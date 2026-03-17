import java.util.*;
public class uniqueNoOfOccurences {
    public static boolean isUNique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int x : map.values()) {
            set.add(x);
        }
        return map.size() == set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.print(isUNique(arr));
    }
}
