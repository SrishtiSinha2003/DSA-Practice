import java.util.*;
public class reverseUnique {
    public static void main(String[] args) {
        String s = "google";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set) {
            sb.append(c);
        }
        System.out.println(sb.reverse().toString());
    }
}
