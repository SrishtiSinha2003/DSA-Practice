import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class threeSum {
    public static List<List<Integer>> sum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            int j = i+1;
            int k = arr.length-1;
            while (j<k) {
                int total = arr[i] + arr[j] + arr[k];

                if(total > 0) {
                    k--;
                } else if(total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                } 
                    j++;
                    k--;

                    // skip duplicate j
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    // skip duplicate k
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.print(sum(arr));
    }
}
