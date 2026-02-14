import java.util.HashSet;
public class longestSubWithUniqueChar {
    public static int countChar(String s) {
        int left = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcdefabcbb";
        System.out.println(countChar(s));
    }
}
