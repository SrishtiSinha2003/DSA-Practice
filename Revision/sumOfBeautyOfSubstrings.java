import java.util.*;
public class sumOfBeautyOfSubstrings {
    public static int beauty(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int val : map.values()) {
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }
                sum += (max-min);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "xyx";
        System.out.print(beauty(s));
    }
}
