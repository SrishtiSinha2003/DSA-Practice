import java.util.*;
public class majorityElementII {
    public static List<Integer> element(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int threshold = arr.length/3;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if(count > threshold) {
                res.add(element);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> result = element(arr);
        System.out.print(result);
    }
}
