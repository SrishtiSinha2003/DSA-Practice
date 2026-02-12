public class longestBalancedSub {
    public static int count(String s) {
        int open = 0;
        int close = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                if(open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
    return s.length() - (open+close);
    }
    public static void main(String[] args) {
        String s = "()())";
        System.out.println(count(s));
    }
}
