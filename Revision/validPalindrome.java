public class validPalindrome {
    public static boolean isValid(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isValid(s));
    }
}
