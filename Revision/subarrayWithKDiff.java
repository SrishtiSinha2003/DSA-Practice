import java.util.HashMap;
public class subarrayWithKDiff {

    public static int subWithK(int[] arr, int k) {
        int subWithMaxK = subarryWithAtMostK(arr, k);
        int reducedSubWithK = subarryWithAtMostK(arr, k-1);
        return subWithMaxK - reducedSubWithK;
    }
    public static int subarryWithAtMostK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            while(map.size() > k) {
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            ans += right-left+1;
            right++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 2;
        System.out.print(subWithK(arr, k));
    }
}
