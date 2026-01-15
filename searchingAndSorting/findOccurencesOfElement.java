import java.util.Arrays;

public class findOccurencesOfElement {
    public static int[] occurences(int[] arr, int[] queries, int x) {
        int[] indices = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                indices[count] = i;
                count++;
            }
        }
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int k = queries[i];
            if(k<= count) {
                ans[i] = indices[k-1];
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,7};
        int[] queries = {1,3,2,4};
        int x = 1;
        int[] result = occurences(arr, queries, x);
        System.out.println(Arrays.toString(result));
    }
}
