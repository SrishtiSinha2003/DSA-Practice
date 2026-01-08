public class ransomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // Count magazine characters
        for (int j = 0; j < magazine.length(); j++) {
            freq[magazine.charAt(j) - 'a']++;
        }

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }

        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}

