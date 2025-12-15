// public class FindMinMax {
//     public static void element(int arr[]) {
//         int min = arr[0];
//         int max = arr[0];

//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] < min)
//                 min = arr[i];
//             if(arr[i] > max)
//                 max = arr[i];
//         }
//             System.out.println("min: " + min);
//             System.out.println("max: " + max);
//     }
//     public static void main(String args[]) {
//         int arr[] = {2,3,5,1};
//         element(arr);
//     }
// }


public class FindMinMax{
    public static void element(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6};
        element(arr);
    }
}