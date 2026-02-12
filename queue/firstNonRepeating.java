import java.util.*;
public class firstNonRepeating {
    public static int[] count(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[arr.length];
        // Find max element to decide frequency array size
        int max = 0;
        for(int x : arr) {
            max = Math.max(max, x);
        }
        int[] freq = new int[max + 1];
        for(int i = 0; i < arr.length; i++) {
            // increase frequency
            freq[arr[i]]++;
            // add to queue
            q.offer(arr[i]);
            // remove repeating elements from front
            while(!q.isEmpty() && freq[q.peek()] > 1) {
                q.poll();
            }
            // store answer
            if(q.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = q.peek();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,4,4,4};
        int[] ans = count(arr);

        for(int x : ans) {
            System.out.print(x + " ");
        }
    }
}
