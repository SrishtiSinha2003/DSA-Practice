// public class moveZerosToEnd {
//     public static void newArray(int[] arr) {
//         int index = 0;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]!= 0) {
//                 arr[index++] = arr[i]; // if ele is not 0 then fill that index with arr[i]
//             }
//         }
//         while(index < arr.length) {
//             arr[index++] = 0; //fill extra indices of arr with 0 
//         }
//     }
//     public static void main(String args[]) {
//         int [] arr = {2,0,3,0,1,0,4,0};
//         newArray(arr);

//         for(int x : arr) {
//             System.out.println(x + " ");
//         }
//     }
// }

public class moveZerosToEnd { 
    public static void newArray(int[] arr) {
        int index = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] !=0) {
                arr[index++] = arr[i];
            }
        
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
    public static void main(String args[]) {
        int [] arr = {0,3,0,1,0,2,0};
        newArray(arr);
        for(int x : arr)
        System.out.println(x +  " ");
    }
}