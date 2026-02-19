
import java.util.*;
public class minimizeUniqueNumber {
    public static int minimize(int[] arr, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        List<Integer> arrayList = new ArrayList<>(map.values());
        Collections.sort(arrayList);
        int count = arrayList.size();
        for(int num : arrayList) {
            if(x >= num) {
                x -= num;
                count--;
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,5,6};
        int x = 4;
        System.out.println(minimize(arr, x));
    }
}
