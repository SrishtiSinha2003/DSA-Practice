import java.util.Stack;

public class reversePolishNotation {
    public static String exp (String s) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                result += c;
            } else if(c == ')') {
                while((c = stack.pop()) != '(') {
                    result += c;
                }
            } else {
                stack.push(c);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "(a+(b*c))";
        System.out.println(exp(s));
    }
}
