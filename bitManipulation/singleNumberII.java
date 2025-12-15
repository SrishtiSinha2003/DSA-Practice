import java.util.HashMap;
import java.util.Map;

public class singleNumberII {
    public static int XOR(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(XOR(arr));
    }
}
