public class nimGame {
    public static void main(String[] args) {
        String s = "aaa";
        int[] freq = new int[26];

        for(char c : s.toCharArray()) { // count freq
            freq[c-'a']++;
        }
        int xor = 0;
        for(int f : freq) {
            xor ^= f;             // compute xor
        }
        if(xor == 0) {
            System.out.print("Banta");
        } else {
            System.out.print("santa");
        }
    }
}
