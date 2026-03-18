import java.util.Arrays;
public class validAnagram{
    public static boolean valid(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
       String s = "stop";
       String t = "post";
       System.out.println(valid(s, t));
    }
}
