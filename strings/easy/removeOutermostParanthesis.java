public class removeOutermostParanthesis {
    public static String remove(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);  // not outermost
                }
                depth++;
            } else { // ch == ')'
                depth--;
                if (depth > 0) {
                    result.append(ch);  // not outermost
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(remove(s));
    }
}
