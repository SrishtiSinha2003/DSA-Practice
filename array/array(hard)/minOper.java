import java.util.HashMap;

public class minOper{
    public static int minOperationToMakeElementsEqual(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        for(int val : map.values()) {
            maxFreq = Math.max(val, maxFreq);
        }
        return arr.length - maxFreq;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(minOperationToMakeElementsEqual(arr));
    }
}