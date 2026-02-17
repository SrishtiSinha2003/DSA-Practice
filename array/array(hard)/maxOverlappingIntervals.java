import java.util.*;
public class maxOverlappingIntervals {
    public static int countOverlap(int[][] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] interval : arr) {
            map.put(interval[0], map.getOrDefault(interval[0], 0)+ 1);
            map.put(interval[1]+1, map.getOrDefault(interval[1]+1, 0)+ -1);
        }
        int ans = 0;
        int count = 0;
        for(int x : map.values()) {
            count += x;
            ans = Math.max(ans, count);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 8}, {2, 5}, {5, 6}, {3, 7}, {6, 10}};
        System.out.println(countOverlap(arr));
    }
}
