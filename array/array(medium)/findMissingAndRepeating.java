import java.util.ArrayList;

// public class findMissingAndRepeating {
//     //function
//     static ArrayList<Integer> find (int[] arr) {
//         int n = arr.length;
//         int[] count = new int [n+1];
//         ArrayList<Integer> result = new ArrayList<>();
//         for(int i=0; i<n; i++) {
//             count[arr[i]]++;
//         }
//         int repeating = -1, missing = -1;
//         for(int i=1; i<=n; i++){
//             if(count[i] == 2) {
//                 repeating = i;
//             }
//             if(count[i] == 0) {
//                 missing = i;
//             }
//         }
//         result.add(repeating);
//         result.add(missing);

//         return result;
//     }
//     public static void main(String args[]) {
//         int[] arr = {1,2,3,2,5};
//         System.out.println(find(arr));
//     }
// }


public class findMissingAndRepeating {
    static ArrayList<Integer> find(int[] arr) {
        int n = arr.length;
        int[] count = new int[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }
        int repeating = -1, missing = -1;
        for(int i=0; i<=n; i++) {
            if(count[i] == 2) {
                repeating = i;
            }
            if(count[i] == 0) {
                missing = i;
            }
        }
        result.add(repeating);
        result.add(missing);

        return result;
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,5,2};
        System.out.println(find(arr));
    }
}