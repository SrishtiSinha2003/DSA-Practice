//import java.util.Arrays;

// public class binarySearch {
//     public static int search(int[] arr, int target) {
//         int low = 0, high = arr.length-1;
//         while(low <= high) {
//             int mid = low + (high - low) /2;

//             if(arr[mid] == target)
//                 return mid;
            
//             if(arr[mid] < target)
//                 low = mid + 1;

//             else
//                 high = mid - 1;
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int[] arr = {2,1,4,3,5,2,1};
//         int target = 2;
//         Arrays.sort(arr); // binary search always works on sorted array
//         int result = search(arr, target);
//         if(result == -1)
//             System.out.println("Element not present");
//         else
//             System.out.print("Element is present at " + result);
//     }
// }


public class binarySearch{
    public static int search(int[] arr, int x) {
        int l = 0, h = arr.length-1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(arr[m] == x)
                return m;
            if(arr[m] < x)
                l = m+1;
            else
                h = m-1;
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int x = 4;
        int r = search(arr, x);
        if(r == -1)
            System.out.print("not present");
        else
            System.out.print("present at "+ r);
    }
}