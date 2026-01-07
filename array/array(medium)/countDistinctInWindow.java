import java.util.ArrayList;
import java.util.HashMap;

public class countDistinctInWindow {
    public static ArrayList<Integer> count(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // first window
        for(int i=0; i<k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // add the count of the distincy elements in the first window
        result.add(map.size());

        // slide the window
        for(int i=k; i<arr.length; i++) {
            // remove the first element
            int removedEle = arr[i-k];
            if(map.get(removedEle) == 1) {
                map.remove(removedEle);
            } else {
                map.put(removedEle, map.get(removedEle)- 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            result.add(map.size());
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList<Integer> result = count(arr, k);
        System.out.println(result);
        
    }
}
