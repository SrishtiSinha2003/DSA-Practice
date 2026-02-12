public class longestBalancedSubstring {
    public static int count(String s) {
        int maxLength = 0;
        for(int i=0; i<s.length(); i++) {
            int[] freq = new int[26];
            int distinct = 0;
            int maxfreq = 0;
            for(int j=0; j<s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                if(freq[idx] == 0) {
                    distinct++;
                }
                freq[idx]++;
                maxfreq = Math.max(maxfreq, freq[idx]);
                int length = j-i+1;
                if(length == distinct*maxfreq) {
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(count(s));
    }
}
