public class maxNestingDepth {
    public static int depth(String s) {
        int max = 0, count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                if(max < count) {
                    max = count;
                }
            } else if(c == ')') {
                count--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.print(depth(s));
    }
}
