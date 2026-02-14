public class longestSubstringWithoutVowel {
    public static int length(String s) {
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count = 0;
            } else {
                count++;
                maxcount = Math.max(count, maxcount);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        String s = "searching";
        System.out.print(length(s));
    }
}