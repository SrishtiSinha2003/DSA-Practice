// import java.util.*;

// public class RemoveDuplicates {
//     public static void remove(int [] arr) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }
//         for(int x : set) {
//             System.out.println(x + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int [] arr = {3,4,2,1,5,2,1,2,3};
//         remove(arr);
//     }
// }


import java.util.*;
public class RemoveDuplicates {
    public static void remove(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        for(int x : set) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {2,1,3,2,1,4,5,6,2};
        remove(arr);
    }
}