import java.util.HashMap;
public class binarySubWithSum {
    public static int sum(int[] arr, int goal) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x : arr) {
            sum += x;
            if(map.containsKey(sum - goal)) {
                count += map.get(sum-goal);
            } else {
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        return count;
    }
    public static void  main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        System.out.print(sum(arr, goal));
    }
}
