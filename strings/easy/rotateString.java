public class rotateString {
    public static boolean rotate(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String temp = s + s;
        return temp.contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        System.out.println(rotate(s, goal));
    }
}
