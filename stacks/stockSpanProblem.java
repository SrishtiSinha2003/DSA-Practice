import java.util.Arrays;
import java.util.Stack;

public class stockSpanProblem {
    public static int[] ssp(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            a[i] = stack.isEmpty() ? i+1 : i-stack.peek();
            stack.push(i);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        int[] ans = ssp(arr);
        System.out.println(Arrays.toString(ans));
    }
}
