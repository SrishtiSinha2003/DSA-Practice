import java.util.HashSet;

public class removeDuplicatesInString { 
    public static String remove(String s) {
        HashSet<Character> exist = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(!exist.contains(ch)) {
                sb.append(ch);
                exist.add(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(remove(s));
    }
}
