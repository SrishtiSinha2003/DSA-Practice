import java.util.*;
public class countNumberOfSubstrings {
    public static int atMostK(String s, int k) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right <s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            max += right-left+1;
        }
        return max;
    }
    public static int distinct(String s, int k) {
        return atMostK(s, k) - atMostK(s, k-1);
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.print(distinct(s, k));
    }
}
