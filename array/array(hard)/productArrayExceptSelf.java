import java.util.Arrays;

public class productArrayExceptSelf {
    public static int[] product(int[] arr) {
        
        // count the number of zeros with the idx at which it is present
        // initially zeros are 0
        // and prod is 1

        int prod = 1, zeros = 0, idx = -1;
        int n = arr.length;

       // count the zeros and keep the track of index of the zero 
       for(int i=0; i<arr.length; i++) {
        if(arr[i] == 0) {
            zeros++;
            idx = i;
        }else {
            prod *= arr[i];
        }
    }
    int[] res = new int[n];
    Arrays.fill(res, 0);
    
     // If no zeros, calculate the product for all elements
        if (zeros == 0) {
            for (int i = 0; i < n; i++) 
                res[i] = prod / arr[i];
        }
        // If one zero, set product only at the zero's index
        /* If there is exactly one zero, the product for that index will be the product of all 
        other non-zero elements, while the elements in rest of the indices will be zero. 
        If there are more than one zero, the product for all indices will be zero, 
        since multiplying by zero results in zero.
 */
        else if (zeros == 1)
            res[idx] = prod;

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,0,5,0,2};
        int[] res = product(arr);
        for(int val : res) {
            System.out.println(val + " ");
        }
    }
}