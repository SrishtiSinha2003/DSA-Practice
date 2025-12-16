import java.util.*;
public class countDistinct {
    public static int count(int arr[], int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            // add all the elements to the HashSet
            hs.add(arr[i]);
        }

        // return the size of hashset as
        // it consists of all Unique elements
        return hs.size();
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[]= new int[] {6, 10, 5, 4, 9, 120, 4, 6, 10};
        System.out.println(count(arr, arr.length));
    }
}

/*The idea is to traverse the given array from left to 
right and keep track of visited elements in a hash set , 
as a set consists of only unique elements. 

 */