import java.util.Arrays;

public class validAnagram {
    public static boolean valid(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
    public static void main(String[] args) {
       String s = "geeks";
       String t = "kseeg";
       System.out.println(valid(s, t));
    }
}