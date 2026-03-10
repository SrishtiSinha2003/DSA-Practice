import java.util.Stack;

public class subarrayWithFirstElementMinimum {
    public static int find(int[] arr) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            int last = st.isEmpty() ? arr.length : st.peek();
            ans += last-i;
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.print(find(arr));
    }
}
