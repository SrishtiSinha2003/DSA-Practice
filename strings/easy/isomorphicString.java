import java.util.*;
public class isomorphicString {

    public static boolean areIsomorphic(String s1, String s2) {
        // If lengths of both strings are not the same, they can't be isomorphic.
        if (s1.length() != s2.length()) return false;
        
        // HashMaps to store character mappings
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            // If there's already a mapping for ch1 in s1 to ch2 in s2, check if it's valid
            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) return false;
            } else {
                map1.put(ch1, ch2);
            }
            
            // Similarly, check if there's a valid reverse mapping from s2 to s1
            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1) return false;
            } else {
                map2.put(ch2, ch1);
            }
        }
        
        // If no conflicts, the strings are isomorphic
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aab", s2 = "xxy";
        System.out.println(areIsomorphic(s1, s2));
    }
}