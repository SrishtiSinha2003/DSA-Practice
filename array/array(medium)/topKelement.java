import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKelement {
    public static int[] kElements(int[] arr, int k) {
        // step 1 : freq map
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+ 1);
        }
        // step 2 : sort
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        // step 3 : extract top k elements
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        int[] result = kElements(arr, k);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
