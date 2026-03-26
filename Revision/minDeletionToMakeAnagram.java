public class minDeletionToMakeAnagram {
    public static int countDeletion(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for(char c : s.toCharArray()) {
            freqS[c-'a']++;
        }
        for(char c : t.toCharArray()) {
            freqT[c-'a']++;
        }
        int deletions = 0;
        for(int i=0; i<26; i++) {
            deletions += Math.abs(freqS[i] - freqT[i]);
        }
        return deletions;
    }
    public static void main(String[] args) {
        String s = "data";
        String t = "structures";
        System.out.print(countDeletion(s, t));
    }
}
