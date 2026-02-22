public class countOperation {
    public static int countop(String s, int k) {
        boolean[] infected = new boolean[s.length()];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                int left = Math.max(0, i-k);
                int right = Math.min(s.length()-1, i+k);

                for(int j=left; j<=right; j++) {
                    infected[j] = true;
                }
            }
        }
        int count = 0;
        for(boolean x : infected) {
            if(x) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "00100100";
        int k = 1;
        System.out.println(countop(s, k));
    }
}
