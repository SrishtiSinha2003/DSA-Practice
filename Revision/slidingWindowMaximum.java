import java.util.*;
public class slidingWindowMaximum {
    public static int[] result(int[] arr, int k) {
        if(arr == null || k == 0) return new int[0];
        int n = arr.length;
        int[] res = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            if(!deque.isEmpty() && deque.peekFirst() == i-k) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i >= k-1) {
                res[i-k+1] = arr[deque.peekFirst()];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = result(arr, k);
        System.out.print(Arrays.toString(result));
    }
}
