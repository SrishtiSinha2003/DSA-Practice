import java.util.*;
public class productOfArrayWithItself {
    public static int[] product(int[] arr) {
        int zero = 0, idx = -1, prod = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zero++;
                idx = i;
            } else {
                prod *= arr[i];
            }
        }
        int[] res = new int[arr.length];
        Arrays.fill(res, 0);
        for(int i=0; i<arr.length; i++) {
            if(zero == 0) {
                res[i] = prod/arr[i];
            } else if(zero == 1) {
                res[idx] = prod;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,0,2};
        int[] ans = product(arr);
        for(int val : ans) {
            System.out.print(val + " ");
        }
    }
}