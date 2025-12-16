import java.util.ArrayList;

public class implementation {
    public static ArrayList<Integer> sum(int[] arr) {
        
        // to store prefix sum we need to create new arraylist
        ArrayList<Integer> prefixSum = new ArrayList<>();

        // initialize the first element
        prefixSum.add(arr[0]);

        // Adding present element with previous element
        for (int i = 1; i <arr.length; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);

        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};

        ArrayList<Integer> prefixSum = sum(arr);
        
        for(int x : prefixSum) {
            System.out.println(x + " ");
        }
    }
}

/*Given an array arr[], Find the prefix sum of the array.
 A prefix sum array is another array prefixSum[] of the same size, such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.

The idea is to create an array prefixSum[] of size n, and for each index i in range 1 to n - 1, 
set prefixSum[i] = prefixSum[i - 1] + arr[i]
 */
