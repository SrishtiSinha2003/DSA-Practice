import java.util.*;
public class generateParanthesis {
    public static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    public static void backtrack(List<String> result, String ans, int open, int close, int n) {
        if(ans.length() == 2*n) {
            result.add(ans);
            return;
        }
        if(open < n) {
            backtrack(result, ans + "(", open+1, close, n);
        }
        if(close < open) {
            backtrack(result, ans + ")", open, close+1, n);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generate(n);
        System.out.print(result.toString());
    }
}