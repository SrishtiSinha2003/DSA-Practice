import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static int[] nge (int[] arr) {
        int[] a = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            a[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,6};
        int[] ans = nge(arr);
        System.out.println(Arrays.toString(ans));
    }
}
