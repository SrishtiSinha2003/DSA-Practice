import java.util.PriorityQueue;
public class kthSmallest {
    public static int small(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr) {
            pq.add(num);
        }
        for(int i=1; i<k; i++) {
            pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.print(small(arr, k));
    }
}
