// longest subarray with atmost two distinct integers
/* So valid windows are:

[2,2,2] → 1 distinct ✅

[1,2] → 2 distinct ✅

[1,2,3] → 3 distinct ❌ */
import java.util.*;
public class fruitBasket {
    public static int distinct(int[] arr) {
        int left = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            while(map.size() > 2) {
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.print(distinct(arr)); 
    }
}