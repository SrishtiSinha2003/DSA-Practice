import java.util.*;
public class postFix {
    public static int evaluate(String exp) {
        Deque<Integer> stack = new ArrayDeque<>();
        String[] parts = exp.trim().split("\\s+");
        for(String token : parts) {
            if(Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.print(evaluate(exp));
        sc.close();
    }
}
