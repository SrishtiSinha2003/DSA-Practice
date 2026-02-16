import java.util.*;
public class countElementsWithMaxFreq {
    public static int freqCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int x : map.values()) {
            max = Math.max(max, x);
            if(x == max) {
                count += max;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(freqCount(arr));
    }
}
