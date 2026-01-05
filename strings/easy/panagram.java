public class panagram {
    public static boolean check(String s) {
        int max_char = 26;
        boolean[] vis = new boolean[max_char];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                vis[c - 'A'] = true;
            } else if (c >= 'a' && c <= 'z') {
                vis[c - 'a'] = true;
            }
        }

        for (int i = 0; i < max_char; i++) {
            if (!vis[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(s));
    }
}
