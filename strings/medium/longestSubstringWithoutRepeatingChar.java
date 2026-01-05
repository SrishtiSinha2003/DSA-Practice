import java.util.HashMap;

public class longestSubstringWithoutRepeatingChar {
    public static int longest(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int end = 0; end <s.length(); end++) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcdefghijklmnopbcbb";
        System.out.println(longest(s));
    }
}
