public class countMonotonous {
    public static int count(String s) {
        int ans = 0;
        int c = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                c++;
            } else {
                ans += (c * (c + 1)) / 2;
                c = 1;
            }
        }

        // 🔥 Add last group
        ans += (c * (c + 1)) / 2;

        return ans;
    }

    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(count(s)); // 13
    }
}