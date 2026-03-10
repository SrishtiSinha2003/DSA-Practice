import java.util.*;
public class longSubWithKDistinct {
    public static int longSub(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = -1;
        for(int right = 0; right < s.length(); right ++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if(map.size() == k) {
                maxLength = Math.max(maxLength, right-left+1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.print(longSub(s, k));
    }
}
