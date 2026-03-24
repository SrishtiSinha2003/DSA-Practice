public class backspaceStringCompare {
    public static boolean compare(String s, String t){
        return check(s).equals(check(t));
    }
    private static String check(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c != '#') {
                sb.append(c);
            } else if(str.length() != 0) {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.print(compare(s, t));
    }
}