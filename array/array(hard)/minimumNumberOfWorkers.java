import java.util.*;
public class minimumNumberOfWorkers {
    public static int workers(int[] arr) {
        int n = arr.length;
        ArrayList<int[]> intervals = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(arr[i] != -1) {
                int start = Math.max(0, i-arr[i]);
                int end = Math.min(n-1, i+arr[i]);
                intervals.add(new int[] {start, end});
            }
        }
        if(intervals.size() == 0) return -1;
        
        // sort intervals
        intervals.sort((a, b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            } return b[1] - a[1];
        });

        int currentEnd = -1;
        int count = 0;
        int index = 0;

        while(currentEnd < n-1) {
            int farthest = currentEnd;

            while (index < intervals.size() &&
                    intervals.get(index)[0] <= currentEnd + 1) {
                        farthest = Math.max(farthest, intervals.get(index)[1]);
                        index++;
                } 
                if(farthest == currentEnd) {
                    return -1;
                } 
                currentEnd = farthest;
                count++;       
            }
            return count;
        }
    public static void main(String[] args) {
        int[] arr = {1,2,1,0};
        System.out.println(workers(arr));
    }
}
