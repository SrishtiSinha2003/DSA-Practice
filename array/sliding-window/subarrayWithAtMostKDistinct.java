import java.util.HashMap;

public class subarrayWithAtMostKDistinct {
    public static int count(int[] arr, int k) {
        if(k == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0; right<arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+ 1);
            
            while(map.size() > k) {
                map.put(arr[left], map.get(arr[left])- 1);
                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int k = 2;
        System.out.println(count(arr, k));
    }
}
