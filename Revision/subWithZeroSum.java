import java.util.HashMap;
public class subWithZeroSum {
    public static int length(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        map.put(0, -1);
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(sum)) {
                int len = i-map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {-3, 5, 2, -3, 1};
        System.out.println(length(arr));
    }
}
