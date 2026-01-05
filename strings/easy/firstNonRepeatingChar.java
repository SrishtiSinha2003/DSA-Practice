public class firstNonRepeatingChar {
    public static char character(String s) {
        int max_char = 26;
        int[] freq = new int[max_char];

        for(char c : s.toCharArray()) {
            freq[c-'a']++;
        }
        for(char c: s.toCharArray()) {
            if(freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(character(s));
    }
}
