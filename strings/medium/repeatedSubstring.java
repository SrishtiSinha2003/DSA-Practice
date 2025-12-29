public class repeatedSubstring {
    public static boolean pattern(String s) {
        String doubled = s + s;
        // Remove first and last character
        String trimmed = doubled.substring(1, doubled.length() - 1);
        return trimmed.contains(s);
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(pattern(s));
    }
}

