import java.util.Arrays;
import java.util.Stack;

public class previousGreaterElement {
    public static int[] pge (int[] arr) {
        int[] a = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            a[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        int[] ans = pge(arr);
        System.out.println(Arrays.toString(ans));
    }
}
